package com.pogorelov.projectOOP;

import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaxDeclaration {
    public static void createYearDeclaration () {
        HashMap <String, HashMap <String, Double>> yearDeclaration = new HashMap<>();

        MonthReport january = new MonthReport();
        yearDeclaration.put(Util.JANUARY, january.createMonthReport(Util.JANUARY));

        MonthReport february = new MonthReport();
        yearDeclaration.put(Util.FEBRUARY, february.createMonthReport(Util.FEBRUARY));

        MonthReport march = new MonthReport();
        yearDeclaration.put(Util.MARCH, march.createMonthReport(Util.MARCH));

        MonthReport april = new MonthReport();
        yearDeclaration.put (Util.APRIL, april.createMonthReport(Util.APRIL));

        MonthReport may = new MonthReport();
        yearDeclaration.put (Util.MAY, may.createMonthReport(Util.MAY));

    }
}
