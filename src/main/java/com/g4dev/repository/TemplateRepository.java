package com.g4dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g4dev.model.Template;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {

}
