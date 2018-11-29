package com.pogorelov.projectOOP;

import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TaxDeclaration {
    public void createYearDeclaration() {
        List<Tax> yearDeclaration = new ArrayList<>();

        for (Month month : Month.values()) {
            addToYearDeclaration(yearDeclaration, month.name());
        }

        Map<NameOfTax, DoubleSummaryStatistics> statisticsMap = new HashMap<>();

        countTaxStatistics(yearDeclaration, statisticsMap);
        final Map<NameOfTax, Double> finalStatistics = statisticsMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(DoubleSummaryStatistics::getSum)))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getSum(),
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(finalStatistics);
        System.out.println(finalStatistics.values().stream().mapToDouble(x -> x).sum());

    }

    private void countTaxStatistics(List<Tax> yearDeclaration, Map<NameOfTax, DoubleSummaryStatistics> statisticsMap) {
        for (NameOfTax name : NameOfTax.values()) {
            statisticsMap.putAll(yearDeclaration.stream()
                    .filter(tax -> tax.getArticle().equals(name))
                    .collect(Collectors.groupingBy(Tax::getArticle,
                            Collectors.summarizingDouble(tax -> tax.getSumOfLoan().doubleValue()))));
        }
    }

    private void addToYearDeclaration(List<Tax> collect, String month) {
        MonthReport monthReport = new MonthReport();
        collect.addAll(monthReport.createMonthReport(month));
    }
}