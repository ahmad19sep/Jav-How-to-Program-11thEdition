package ch8ClassesAndObjects;

import org.jetbrains.annotations.NotNull;

public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;

    }

    public Time2(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;

    }

    public Time2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;

    }

    public Time2(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour-Range: '0-23'");
        }
        if (minute > -1 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute-Range: '0-59'");
        }
        if (second > -1 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second-Range: '0-59'");
        }

    }

    public Time2(Time2 time) {
        this(time.hour, time.minute, time.second);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour-Range: '0-23'");
        }
    }

    public void setMinute(int minute) {
        if (minute > -1 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute-Range: '0-59'");
        }
    }

    public void setSecond(int second) {
        if (second > -1 && second < 60) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Second-Range: '0-59'");
        }
    }

    public int getHour() {
        return (this.hour*3600);
    }

    public int getMinute() {
        return (this.minute*60);
    }

    public int getSecond() {
        return this.second;
    }

    public int universalTime() {
        return (getHour()+getMinute()+getSecond());
    }

    public String StandardTime() {
        return String.format("%02d:%02d:%02d-%s", (getHour() != 0 && getHour() != 12 ? getHour() % 12 : 12),
                getMinute(), getSecond(), (getHour() < 12 ? "am" : "pm"));
    }
}