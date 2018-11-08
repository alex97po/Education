package com.pogorelov.projectOOP;

import java.util.HashMap;
import java.util.Scanner;

public class MonthReport extends Incomes {
    public void createMonthReport () {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Util.INPUT_MAINSALARY);
        Incomes.SalaryFromMainJob = scanner.nextDouble();
        System.out.print(Util.INPUT_ADDSALARY);
        Incomes.SalaryFromAdditionalJob = scanner.nextDouble();
        HashMap <String, Number> taxesForMonth = new HashMap<>();
        taxesForMonth.put(Util.MAINSALARY, Incomes.SalaryFromMainJob*TaxRates.taxOnSalary);
        taxesForMonth.put(Util.ADDSALARY, Incomes.SalaryFromAdditionalJob*TaxRates.taxOnSalary);
        System.out.println(taxesForMonth);
    }
}
