package com.bookshop.bookDTO;

public class BookDTO{
	
	private Long id;
	
	private String imageLink;
	
	private String title;
	
    private String author;
	
    private String publisher;
	
    private int releaseYear;
	
    private int numOfPage;
	
    private long price;
    
    private String description;
    
    private String categoty;
    
    private int rateStar;
    
    private int numOfReview;

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

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getNumOfPage() {
		return numOfPage;
	}

	public void setNumOfPage(int numOfPage) {
		this.numOfPage = numOfPage;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
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

	public int getRateStar() {
		return rateStar;
	}

	public void setRateStar(int rateStar) {
		this.rateStar = rateStar;
	}

	public int getNumOfReview() {
		return numOfReview;
	}

	public void setNumOfReview(int numOfReview) {
		this.numOfReview = numOfReview;
	}
}
