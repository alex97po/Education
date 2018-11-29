package com.pogorelov.projectOOP;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Incomes {
    private BigDecimal salaryFromMainJob;
    private BigDecimal salaryFromAdditionalJob;
    private BigDecimal remunerations;
    private BigDecimal propertySale;


}