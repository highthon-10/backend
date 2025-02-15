package org.example.hyodo.domain.diary.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Diary(
    userId: Long,
    title: String,
    content: String,
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val userId: Long = userId

    val title: String = title

    @Column(columnDefinition = "TEXT")
    val content: String = content
}