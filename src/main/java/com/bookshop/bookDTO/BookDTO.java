package com.bookshop.bookDTO;

public class BookDTO{
	private String imageLink;
	
	private String title;
	
    private String author;
	
    private String publisher;
	
    private Integer releaseYear;
	
    private Integer numOfPage;
	
    private Long price;
    
    private String description;
    
    private String categoty;
    
    private Integer rateStar;
    
    private Integer numOfReview;

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
