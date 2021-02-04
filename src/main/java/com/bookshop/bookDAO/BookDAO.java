package com.bookshop.bookDAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Nationalized;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "book")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class BookDAO{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ApiModelProperty(notes = "Base64 image")
	@Column(nullable = false)
	@Nationalized
	private String imageLink;
	
	@Column(nullable = false)
	@Nationalized
	private String imagePublicId;
	
	@Column(nullable = false)
	@Nationalized
	private String title;
	
	@Column(nullable = false)
	@Nationalized
    private String author;
	
	@Column(nullable = false)
	@Nationalized
    private String publisher;
	
	@Column(nullable = false)
    private Integer releaseYear;
	
	@Column(nullable = false)
    private Integer numOfPage;
	
	@Column(nullable = false)
    private Long price;
	
	@Column(nullable = false)
	@Nationalized
	private String description;
    
	@Column(nullable = false)
	@Nationalized
    private String categoty;
    
	@Column(nullable = false)
    private Integer rateStar;
    
	@Column(nullable = false)
    private Integer numOfReview;

	public BookDAO() {
	}

	public BookDAO(String imageLink, String imagePublicId, String title, String author, String publisher,
			int releaseYear, Integer numOfPage, Long price, String description, String categoty, Integer rateStar, Integer numOfReview) {
		this.imageLink = imageLink;
		this.imagePublicId = imagePublicId;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.releaseYear = releaseYear;
		this.numOfPage = numOfPage;
		this.price = price;
		this.description = description;
		this.categoty = categoty;
		this.rateStar = rateStar;
		this.numOfReview = numOfReview;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getImagePublicId() {
		return imagePublicId;
	}

	public void setImagePublicId(String imagePublicId) {
		this.imagePublicId = imagePublicId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getNumOfPage() {
		return numOfPage;
	}

	public void setNumOfPage(Integer numOfPage) {
		this.numOfPage = numOfPage;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoty() {
		return categoty;
	}

	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}

	public Integer getRateStar() {
		return rateStar;
	}

	public void setRateStar(Integer rateStar) {
		this.rateStar = rateStar;
	}

	public Integer getNumOfReview() {
		return numOfReview;
	}

	public void setNumOfReview(Integer numOfReview) {
		this.numOfReview = numOfReview;
	}
}
