package com.bookshop.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.bookDAO.BookDAO;
import com.bookshop.bookDTO.BookDTO;
import com.bookshop.repository.BookRepository;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@CrossOrigin
@RestController
public class AppController {
	
	@Autowired
	private Cloudinary cloudinary;
	
	@Autowired
	private BookRepository bookRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "Hello";
	}
	
	@RequestMapping(value = "/api/books", method = RequestMethod.GET)
	public List<BookDAO> getAllBook() {
		return bookRepository.findAll();
	}
	
	@RequestMapping(value = "/api/book/{id}", method = RequestMethod.GET)
	public BookDAO findBook(@PathVariable("id") Long id) {
		Optional<BookDAO> bookDAO = bookRepository.findById(id);
		return bookDAO.get();
	}
	
	@RequestMapping(value = "/api/book", method = RequestMethod.POST)
	public BookDAO addBook(@RequestBody BookDTO bookDTO) throws IOException{
		Map<?, ?> clMap = cloudinary.uploader().upload(bookDTO.getImageLink(), ObjectUtils.emptyMap());
		String imageLink = clMap.get("url").toString();
		String imagePublicId = clMap.get("public_id").toString();
		BookDAO bookDAO = new BookDAO(imageLink, imagePublicId, bookDTO.getTitle(), bookDTO.getAuthor(),
				bookDTO.getPublisher(), bookDTO.getReleaseYear(), bookDTO.getNumOfPage(), bookDTO.getPrice());
		bookRepository.save(bookDAO);
		return bookDAO;
	}
	
	@RequestMapping(value = "/api/book/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) throws IOException {
		BookDAO bookDAO = bookRepository.getOne(id);
		cloudinary.uploader().destroy(bookDAO.getImagePublicId(), ObjectUtils.emptyMap());
		bookRepository.delete(bookDAO);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/book", method = RequestMethod.PATCH)
	public BookDAO editBook(@RequestBody BookDTO bookDTO) throws IOException {
		BookDAO bookDAO = bookRepository.getOne(bookDTO.getId());
		
		String regex = "^http:\\/\\/res.cloudinary.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(bookDTO.getImageLink());

		String imageLink = bookDTO.getImageLink();
		String imagePublicId = bookDAO.getImagePublicId();
        if (!matcher.find()) {
        	cloudinary.uploader().destroy(imagePublicId, ObjectUtils.emptyMap());
        	Map<?, ?> clMap = cloudinary.uploader().upload(bookDTO.getImageLink(), ObjectUtils.emptyMap());
			imageLink = clMap.get("url").toString();
			imagePublicId = clMap.get("public_id").toString();
		}
		
		bookDAO.setId(bookDTO.getId());
		bookDAO.setImageLink(imageLink);
		bookDAO.setImagePublicId(imagePublicId);
		bookDAO.setTitle(bookDTO.getTitle());
		bookDAO.setAuthor(bookDTO.getAuthor());
		bookDAO.setPublisher(bookDTO.getPublisher());
		bookDAO.setReleaseYear(bookDTO.getReleaseYear());
		bookDAO.setNumOfPage(bookDTO.getNumOfPage());
		bookDAO.setPrice(bookDTO.getPrice());
		bookRepository.save(bookDAO);
		return bookDAO;
	}
}