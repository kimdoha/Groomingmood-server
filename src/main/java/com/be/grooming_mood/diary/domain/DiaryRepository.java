package com.be.grooming_mood.diary.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository {
    void save(Diary diary);

}
