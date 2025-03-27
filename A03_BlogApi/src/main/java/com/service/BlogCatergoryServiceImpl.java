package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.BlogCategoryDto;
import com.dto.BlogDto;
import com.model.Blog;
import com.model.BlogCategory;
import com.repo.BlogCategoryRepo;

@Service
public class BlogCatergoryServiceImpl implements BlogCategoryService {

	@Autowired
	BlogCategoryRepo repo;

	@Override
	public BlogCategoryDto addOrUpdateBlogCategory(BlogCategory category) {
		BlogCategory b = repo.save(category);
		BlogCategoryDto dto = new BlogCategoryDto();
		dto.setBlogId(b.getBlogId());
		dto.setBlogName(b.getBlogName());

		return dto;
	}

	@Override
	public List<BlogCategoryDto> list() {
		List<BlogCategory> all = repo.findAll();
		List<BlogCategoryDto> dtos = new ArrayList<>();
		List<BlogDto> list = new ArrayList<>();
		for (BlogCategory b : all) {

			BlogCategoryDto Dto = new BlogCategoryDto();
			Dto.setBlogId(b.getBlogId());
			Dto.setBlogName(b.getBlogName());

			for (Blog blog : b.getBlogs()) {
				BlogDto blogDto = new BlogDto();
				blogDto.setId(blog.getId());
				blogDto.setBlogTitle(blog.getBlogTitle());
				blogDto.setBlogContent(blog.getBlogContent());
				list.add(blogDto);
			}

			Dto.setBlogs(list);
			dtos.add(Dto);

		}

		return dtos;
	}

}
