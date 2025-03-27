package com.service;

import java.util.List;

import com.dto.BlogCategoryDto;
import com.model.BlogCategory;

public interface BlogCategoryService {
	
	
	public BlogCategoryDto addOrUpdateBlogCategory(BlogCategory category);
	
	public List<BlogCategoryDto> list();

}
