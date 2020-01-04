package com.huisam.web.englishlearner.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Word {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String englishMeaning;

    @Column(length = 500, nullable = false)
    private String koreaMeaning;

    @Builder
    public Word(final String englishMeaning, final String koreaMeaning) {
        this.englishMeaning = englishMeaning;
        this.koreaMeaning = koreaMeaning;
    }
}
