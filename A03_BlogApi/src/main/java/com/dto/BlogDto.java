package com.dto;

import java.util.List;

import com.model.BlogCategory;
import com.model.Review;

public class BlogDto {

	
	private int id;

	private String blogTitle;

	private String blogContent;
	
	private BlogCategory category;
	
	private List<Review> review;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}
	
	
}
