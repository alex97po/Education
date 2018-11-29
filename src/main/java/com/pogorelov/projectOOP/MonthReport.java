package com.pogorelov.projectOOP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonthReport {
        public List<Tax> createMonthReport(String month) {
                System.out.println(month);
                Scanner scanner = new Scanner(System.in);
                Incomes incomes = new Incomes();
                System.out.print(Util.INPUT_MAINSALARY);
                incomes.setSalaryFromMainJob(BigDecimal.valueOf(scanner.nextDouble()));
                System.out.print(Util.INPUT_ADDSALARY);
                incomes.setSalaryFromAdditionalJob(BigDecimal.valueOf(scanner.nextDouble()));
                System.out.print(Util.INPUT_REMUNERATIONS);
                incomes.setRemunerations(BigDecimal.valueOf(scanner.nextDouble()));
                System.out.print(Util.INPUT_PROPERTYSALE);
                incomes.setPropertySale(BigDecimal.valueOf(scanner.nextDouble()));

                List<Tax> taxesForMonth = new ArrayList<>();
                taxesForMonth.add(Tax.of(NameOfTax.MAIN_SALARY,
                        incomes.getSalaryFromMainJob().multiply(TaxRates.TAX_ON_SALARY.getPercent()), month));
                taxesForMonth.add(Tax.of(NameOfTax.ADD_SALARY,
                        incomes.getSalaryFromAdditionalJob().multiply(TaxRates.TAX_ON_SALARY.getPercent()), month));
                taxesForMonth.add(Tax.of(NameOfTax.REMUNERATIONS,
                        incomes.getRemunerations().multiply(TaxRates.TAX_ON_REMUNERATIONS.getPercent()), month));
                taxesForMonth.add(Tax.of(NameOfTax.PROPERTY_SALE,
                        incomes.getPropertySale().multiply(TaxRates.TAX_ON_PROPERTY_SALE.getPercent()), month));

                return taxesForMonth;
        }
}