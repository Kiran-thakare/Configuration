package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.BlogCategory;

public interface BlogCategoryRepo extends JpaRepository<BlogCategory, Integer> {

}
