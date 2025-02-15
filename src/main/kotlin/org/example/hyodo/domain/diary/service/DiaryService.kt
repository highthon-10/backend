package org.example.hyodo.domain.diary.service

import org.example.hyodo.domain.diary.domain.Diary
import org.example.hyodo.domain.diary.domain.DiaryRepository
import org.example.hyodo.domain.diary.presentation.DiaryRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DiaryService(
    private val repository: DiaryRepository
) {
    fun findByUserId(userId: Long): List<Diary> = repository.findAllByUserId(userId)
    fun save(request: DiaryRequest) = repository.save(request.toEntity()).id
    fun findById(id: Long): Diary? = repository.findById(id).orElse(null)
}