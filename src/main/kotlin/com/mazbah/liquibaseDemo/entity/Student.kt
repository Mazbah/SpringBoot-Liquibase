package com.mazbah.liquibaseDemo.entity

import javax.persistence.*

@Entity
@Table(name = "student")
data class Student (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") var id: Long? = null,
    @Column(name = "name") var name: String? = null,
    @Column(name = "school") var school: String? = null,
    @Column(name = "address") var address: String? = null,
    @Column(name = "level") var level: String? = null,
    @Column(name = "amount") var amount: String? = null
)