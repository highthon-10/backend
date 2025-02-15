package org.example.hyodo.domain.diary.presentation

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.example.hyodo.domain.diary.domain.Diary
import org.example.hyodo.domain.diary.service.DiaryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/diary")
@RestController
@Tag(name = "Diary", description = "일기")
class DiaryController(
    private val service: DiaryService
) {
    @Operation(summary = "일기 리스트 반환", description = "userId, 1-엄마, 2-아빠, 3-자녀")
    @GetMapping("/{id}")
    fun findByUserId(
        @PathVariable id: Long
    ): List<Diary> {
        return service.findByUserId(id)
    }

    @Operation(summary = "일기 저장")
    @PostMapping
    fun save(@RequestBody request: DiaryRequest): Long? {
        return service.save(request)
    }

    @Operation(summary = "개별 조회")
    @GetMapping("/detail/{id}")
    fun findById(
        @PathVariable id: Long
    ): Diary? {
        return service.findById(id)
    }
}