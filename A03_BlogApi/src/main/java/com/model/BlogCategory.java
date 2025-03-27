package com.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class BlogCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int blogId;

	private String blogName;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Blog> blogs;

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

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

}
