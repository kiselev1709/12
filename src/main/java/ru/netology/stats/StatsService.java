package ru.netology.stats;

public class StatsService {


    public long sum(long[] purchases) {
        long result = 0;
        for (long purchase : purchases) {
            result += purchase;
        }
        return result;
    }

    public long average(long[] purchases) {
        return sum(purchases) / purchases.length;
    }

    public int ReturnMonthWithMax(long[] purchases) {
        long max = getMax(purchases);
        int monthCount = 0;
        int monthWithMax = 0;
        for (long purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }

    public int ReturnMonthWithMin(long[] purchases) {
        long min = getMin(purchases);
        int monthCount = 0;
        int monthWithMin = 0;
        for (long purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                monthWithMin = monthCount;
            }
        }
        return monthWithMin;
    }

    public int monthsWithMoreThanAvg(long[] purchases) {
        long average = average(purchases);
        int monthCount = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthsWithMoreThanLess(long[] purchases) {
        long average = average(purchases);
        int monthCount = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    private long getMax(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        return max;
    }

    private long getMin(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        return min;
    }
}