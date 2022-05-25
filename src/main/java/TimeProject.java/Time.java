package TimeProject.java;

public class Time {
    private int second;
    private int minute;
    private int hour;
    private int date;
    private String[] days = {"null", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private String month;
    private int userMonth;
    private String day;
    private int userDay;
    private String timeFormat;
    private int year;
    private int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] monthNames = {"null", "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    public Time() {

    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;

        } else {
            throw new IllegalArgumentException(" Second out of Range ('0-59')");

        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;

        } else {
            throw new IllegalArgumentException(" Minute out of Range ('0-59')");

        }
    }

    public void setHour(int hour) {
        if (hour > 0 && hour <= 12) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException(" hour out of Range ('1-12')");

        }
    }

    public void setDate(int date, int month) {
        if (date <= months[month] && month > 0 && month < 13) {
            this.date = date;
            this.month = monthNames[month];
            this.userMonth = month;
        } else {
            throw new IllegalArgumentException("Date out of range");
        }
    }

    public void setDays(int day) {
        if (day > 0 && day < 8) {
            this.day = days[day];
            this.userDay = day;
        } else {
            throw new IllegalArgumentException("Days out of bound (1-7)");
        }
    }

 /*   public void setMonth(int month) {
        if (month > 0 && month <= 12){
        this.month=monthNames[month];
    }else {
            throw new IllegalArgumentException("Month out of range (1-12)");
        }
    }*/

    public void setYear(int year) {
        if (year > 0 && year < 5000) {

            this.year = year;
        } else {
            throw new IllegalArgumentException("Years out of bound");
        }
    }

    public void setTimeFormat(String timeFormat) {
        if (timeFormat.equals("am") || timeFormat.equals("pm")) {
            this.timeFormat = timeFormat;
        }
    }

    public void getTime() {
        try {


            for (int i = second; i < 60; i++) {
                System.out.println(i);
                Thread.sleep(500);
                System.out.printf("%02d:%02d:%02d-%s%n", hour, minute, i, timeFormat);
                System.out.printf("%s,%s%d,%d%n",day,month,date,year);
                if (second <= 59) {
                    second++;
                }
                if (second > 59) {
                    i = -1;
                    second = 0;
                    minute++;
                    if (minute > 59) {
                        minute = 0;
                        hour++;
                        if (hour == 12) {
                            hour = 0;
                            if (timeFormat.equals("am")) {
                                timeFormat = "pm";
                            } else if (timeFormat.equals("pm")) {
                                timeFormat = "am";
                                if (date < months[userMonth]) {
                                    date++;

                                } else if (date == months[userMonth]) {
                                    date = 1;
                                    if (userMonth < 12) {
                                        month = monthNames[++userMonth];


                                    } else if (userMonth == 12) {
                                        userMonth=1;
                                        month = monthNames[userMonth];

                                        year++;

                                    }
                                }
                                if (userDay < 7) {
                                    day = days[++userDay];

                                } else if (userDay == 7) {
                                    userDay = 1;
                                    day = days[userDay];
                                }
                            }
                        }
                    }
                }
            }
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d-%s%n", hour, minute, second, timeFormat);
    }
}
