package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private final long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private final StatsService statsService = new StatsService();

    @Test
    public void shouldSum() {
        assertEquals(180, statsService.sum(purchases));

    }

    @Test
    public void shouldAverage() {
        assertEquals(15, statsService.average(purchases));

    }

    @Test
    public void shouldReturnMonthWithMax() {
        assertEquals(8, statsService.ReturnMonthWithMax(purchases));

    }

    @Test
    public void shouldReturnMonthWithMin() {
        assertEquals(9, statsService.ReturnMonthWithMin(purchases));

    }

    @Test
    public void shouldReturnMonthWithMore() {
        assertEquals(5, statsService.monthsWithMoreThanAvg (purchases));

    }

    @Test
    public void shouldReturnMonthWithLess() {
        assertEquals(5, statsService.monthsWithMoreThanAvg(purchases));

    }

}
