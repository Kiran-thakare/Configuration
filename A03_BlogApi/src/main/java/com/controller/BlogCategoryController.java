package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.BlogCategoryDto;
import com.model.BlogCategory;
import com.service.BlogCategoryService;

@RestController
public class BlogCategoryController {

	@Autowired
	BlogCategoryService service;

	@PostMapping("/save")
	public ResponseEntity<?> saveCategory(@RequestBody BlogCategory category) {

		BlogCategoryDto dto = service.addOrUpdateBlogCategory(category);
		if (ObjectUtils.isEmpty(dto)) {
			return new ResponseEntity<>("CheckService not Add Blog Category", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(dto, HttpStatus.OK);

	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllCategory() {

		List<BlogCategoryDto> list = service.list();

		return new ResponseEntity<>(list, HttpStatus.OK);

	}

}
