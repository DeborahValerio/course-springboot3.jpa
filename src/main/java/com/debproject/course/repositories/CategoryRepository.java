package com.debproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
