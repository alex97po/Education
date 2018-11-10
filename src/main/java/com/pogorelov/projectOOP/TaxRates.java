package com.pogorelov.projectOOP;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaxRates {
    TAX_ON_SALARY(BigDecimal.valueOf(0.18)), //18%
    TAX_ON_REMUNERATIONS(BigDecimal.valueOf(0.18)),
    TAX_ON_PROPERTY_SALE(BigDecimal.valueOf(0.18));

    BigDecimal percent;
}
