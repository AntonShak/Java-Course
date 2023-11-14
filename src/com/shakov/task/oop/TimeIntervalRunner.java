package com.shakov.task.oop;

/**
 *
 */

public class TimeIntervalRunner {
    public static void main(String[] args) {

        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        int totalSeconds = timeInterval.totalSeconds();
        System.out.println(totalSeconds);

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());

        timeInterval1.print();

        TimeInterval sumInterval = timeInterval.sum(new TimeInterval(1250));
        sumInterval.print();
        System.out.println(sumInterval.totalSeconds());

    }
}
