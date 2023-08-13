package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public long average(long[] sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        if (sales.length == 0) {
            return 0;
        }
        return sum(sales) / sales.length;
    }

    public int monthMax(long[] sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMin(long[] sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }

    public int monthsBellowAverage(long[] sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        int monthCounter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                monthCounter++;
            }
        }
        return monthCounter;
    }

    public int monthsAboveAverage(long[] sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        int monthAboveCounter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                monthAboveCounter++;
            }
        }
        return monthAboveCounter;
    }
}
