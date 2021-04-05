package com.github.amauri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.amauri.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
