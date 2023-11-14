package com.shakov.task.oop;

public class TimeInterval {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalseconds) {
        this.hours = totalseconds / 3600;
        this.minutes = totalseconds % 3600 / 60;
        this.seconds = totalseconds % 3600 % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    public TimeInterval sum (TimeInterval second){
        return new TimeInterval(totalSeconds() + second.totalSeconds());
    }

    public void print (){
        System.out.println("hours : " + hours + ", minutes : " + minutes + ", seconds : " + seconds);
    }
}


