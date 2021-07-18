package com.mazbah.liquibaseDemo.service

import com.mazbah.liquibaseDemo.entity.Student
import com.mazbah.liquibaseDemo.repository.StudentRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service("StudentService")
class StudentServiceImpl(private val studentRepository: StudentRepository): StudentService {

    override fun findById(id: Long): Student {
        val student = studentRepository.findById(id)
        return student.orElse(null)
    }

//    override fun findByName(name: String): String {
//        return studentRepository.findByName(name)
//    }

    override fun findAll(): List<Student> {
        return studentRepository.findAll()
    }

    override fun findAll(paging: Pageable): Page<Student> {
        return studentRepository.findAll(paging)
    }

    override fun save(student: Student): Student {
        return studentRepository.save(student)
    }
}