package ru.netology.stats;

import javax.annotation.processing.SupportedAnnotationTypes;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySalesAmount(int[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sumAllSales(sales) / sales.length;
    }

    public int monthsBelowAverage(int[] sales) {
        int average = averageMonthlySalesAmount(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(int[] sales) {
        int average = averageMonthlySalesAmount(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

}