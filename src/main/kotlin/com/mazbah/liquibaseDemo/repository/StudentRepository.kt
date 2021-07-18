package com.mazbah.liquibaseDemo.repository

import com.mazbah.liquibaseDemo.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: JpaRepository<Student, Long> {
//
//    @Query("SELECT name FROM Student s WHERE s.name LIKE %:studentName%")
//    fun findByName(studentName: String): String

}