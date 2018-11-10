package com.pogorelov.projectOOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthReport extends Incomes {
    public HashMap <String, Double> createMonthReport (String month) {
        System.out.println(month);
        Scanner scanner = new Scanner(System.in);
        System.out.print(Util.INPUT_MAINSALARY);
        Incomes.SalaryFromMainJob = scanner.nextDouble();
        System.out.print(Util.INPUT_ADDSALARY);
        Incomes.SalaryFromAdditionalJob = scanner.nextDouble();
        System.out.print(Util.INPUT_REMUNERATIONS);
        Incomes.Remunerations = scanner.nextDouble();
        System.out.print(Util.INPUT_PROPERTYSALE);
        Incomes.PropertySale = scanner.nextDouble();



        HashMap <String, Double> taxesForMonth = new HashMap<>();
        taxesForMonth.put(Util.MAINSALARY, Incomes.SalaryFromMainJob*TaxRates.taxOnSalary);
        taxesForMonth.put(Util.ADDSALARY, Incomes.SalaryFromAdditionalJob*TaxRates.taxOnSalary);
        taxesForMonth.put(Util.REMUNERATIONS,Incomes.Remunerations*TaxRates.taxOnRemunerations);
        taxesForMonth.put(Util.PROPERTYSALE,Incomes.PropertySale*TaxRates.taxOnPropertySale);

        return taxesForMonth;
    }
}
