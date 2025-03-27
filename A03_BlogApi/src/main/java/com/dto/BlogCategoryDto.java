package com.dto;

import java.util.List;

import com.model.Blog;

public class BlogCategoryDto {

	private int blogId;

	private String blogName;

	private List<BlogDto> blogs;

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public List<BlogDto> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<BlogDto> blogs) {
		this.blogs = blogs;
	}

	

}
