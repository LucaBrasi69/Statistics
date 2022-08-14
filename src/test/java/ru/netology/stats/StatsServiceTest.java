package ru.netology.stats;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650};

        int expectMinMonth = 1;
        int actualMinMonth = service.minSales(sales);

        assertEquals(expectMinMonth,actualMinMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650};

        int expectMaxMonth = 12;
        int actualMaxMonth = service.maxSales(sales);

        assertEquals(expectMaxMonth,actualMaxMonth);
    }
    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();

        long[] sales = { 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650};

        long expectAllSales = 4500;
        long actualAllSales = service.AllSales(sales);

        assertEquals(expectAllSales,actualAllSales);
    }
    @Test
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();

        long[] sales = { 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650};

        long expectAverageSum = 375;
        long actualAverageSum = service.averageSum(sales);

        assertEquals(expectAverageSum,actualAverageSum);
    }
    @Test
    public void shouldFindLessThenAverage() {
        StatsService service = new StatsService();

        long[] sales = { 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650};

        int expectMonthCounter = 6;
        int actualMonthCounter = service.lessThenAverage(sales);

        assertEquals(expectMonthCounter,actualMonthCounter);
    }

    @Test
    public void shouldFindMoreThenAverage() {
        StatsService service = new StatsService();

        long[] sales = { 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650};

        int expectMonthCounter = 6;
        int actualMonthCounter = service.moreThenAverage(sales);

        assertEquals(expectMonthCounter,actualMonthCounter);
    }
}
