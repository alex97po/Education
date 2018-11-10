package com.pogorelov.projectOOP;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Tax {
    private NameOfTax article;
    private BigDecimal sumOfLoan;
    private String month;

    public static Tax of(NameOfTax article, BigDecimal sumOfLoan, String month) {
        return Tax.builder()
                .article(article)
                .sumOfLoan(sumOfLoan)
                .month(month)
                .build();
    }
}