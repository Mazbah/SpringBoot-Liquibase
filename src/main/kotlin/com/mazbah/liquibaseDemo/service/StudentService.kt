package com.mazbah.liquibaseDemo.service

import com.mazbah.liquibaseDemo.entity.Student
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface StudentService {
    fun findById(id: Long): Student
//    fun findByName(name: String): String
    fun findAll(): List<Student>
    fun findAll(paging: Pageable): Page<Student>
    fun save(student: Student): Student
}