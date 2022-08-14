package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public long AllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public long averageSum(long[] sales){
        return AllSales(sales) / 12;
    }
    public int lessThenAverage(long[] sales) {
        int monthCounter = 0;
        long average = averageSum(sales);
        for (long sale : sales) {
            if (sale > average) {
                monthCounter++;
            }


        }

        return monthCounter;
    }

    public int moreThenAverage(long[] sales) {
        int monthCounter = 0;
        long average = averageSum(sales);
        for (long sale : sales) {
            if (sale < average) {
                monthCounter++;
            }


        }

        return monthCounter;
    }

        }




