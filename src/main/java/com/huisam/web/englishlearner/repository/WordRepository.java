package com.huisam.web.englishlearner.repository;

import com.huisam.web.englishlearner.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
