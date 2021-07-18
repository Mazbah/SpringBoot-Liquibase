package com.mazbah.liquibaseDemo.controller

import com.mazbah.liquibaseDemo.entity.Student
import com.mazbah.liquibaseDemo.repository.StudentRepository
import com.mazbah.liquibaseDemo.service.StudentService
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(private val studentService: StudentService) {

    // Create User
   @PostMapping("/stud")
   fun createStudent(@RequestBody student: Student): Student{
       return studentService.save(student)
   }

    // Get users by Page
    @GetMapping("/stud")
    fun getAllUsers(pageIndex:Int = 1, size:Int): Page<Student> {
        val paging: Pageable = PageRequest.of(pageIndex - 1,size, Sort.by("id").ascending())
        return studentService.findAll(paging)
    }
}