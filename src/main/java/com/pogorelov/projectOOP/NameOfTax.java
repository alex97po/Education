
package com.pogorelov.projectOOP;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NameOfTax {
    MAIN_SALARY("Налог на доход с основного места работы "),
    ADD_SALARY("Налог на доход с дополнительного места работы "),
    REMUNERATIONS("Налог на доход с авторских вознаграждений "),
    PROPERTY_SALE("Налог на доход с продажи имущества ");

    String name;
}