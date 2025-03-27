package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

}
