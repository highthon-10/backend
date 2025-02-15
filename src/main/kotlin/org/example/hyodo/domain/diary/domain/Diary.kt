package org.example.hyodo.domain.diary.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.example.hyodo.global.BaseTimeEntity

@Entity
class Diary(
    userId: Long,
    title: String,
    content: String,
): BaseTimeEntity() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val userId: Long = userId

    val title: String = title

    @Column(columnDefinition = "TEXT")
    val content: String = content
}