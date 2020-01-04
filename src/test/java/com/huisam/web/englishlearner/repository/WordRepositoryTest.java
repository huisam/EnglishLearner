package com.huisam.web.englishlearner.repository;

import com.huisam.web.englishlearner.domain.Word;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class WordRepositoryTest {
    @Autowired
    private WordRepository repository;

    @Test
    @DisplayName("단어가 올바르게 저장되는지 테스트")
    void word_saving_test() {
        /* Given */
        Word word = Word.builder()
                .englishMeaning("cafe")
                .koreaMeaning("카페")
                .build();
        /* When */
        repository.save(word);
        /* Then */
        List<Word> words = repository.findAll();
        Word wordFromRepository = words.get(0);
        assertThat(wordFromRepository.getEnglishMeaning()).isEqualTo("cafe");
        assertThat(wordFromRepository.getKoreaMeaning()).isEqualTo("카페");
    }

    @AfterEach
    void tearDown() {
        repository.deleteAll();
    }
}