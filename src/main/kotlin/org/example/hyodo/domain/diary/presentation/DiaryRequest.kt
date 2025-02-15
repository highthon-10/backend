package org.example.hyodo.domain.diary.presentation

import org.example.hyodo.domain.diary.domain.Diary

data class DiaryRequest(
    val userId: Long,
    val title: String,
    val content: String,
) {
    fun toEntity() = Diary(userId, title, content)
}
