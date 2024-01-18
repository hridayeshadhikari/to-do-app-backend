package com.todolist.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.webapp.entity.Entities;

@Repository
public interface MyRepository extends JpaRepository<Entities, Long> {

}
