package org.example.hyodo.domain.diary.domain

import org.springframework.data.jpa.repository.JpaRepository

interface DiaryRepository: JpaRepository<Diary, Long> {
    fun findAllByUserId(userId: Long): List<Diary>
}