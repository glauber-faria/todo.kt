package com.studies.todo.kt.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Issue (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val  id: Long = -1,
    val name: String = "",
    val description: String = "",
    val created: LocalDateTime = LocalDateTime.now(),
)
