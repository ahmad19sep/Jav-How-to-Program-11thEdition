package Hacker.java.Hacker.Interface;

import OOPInheritance.java.Universe;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.UnaryOperator;

import static java.text.SimpleDateFormat.*;
import static java.time.ZoneId.*;
import static java.time.zone.ZoneOffsetTransitionRule.TimeDefinition.UTC;;
import Hacker.java.Hacker.Interface.Interface;
import ch4.CLCalculator;
//import GoogleKickStart.CLCalculator;
class Counter {

    Integer aa;
    int count;
    Counter(int count) {
        this.count = count;
    }

    public void setCount(int count) {
        Integer[] A=new Integer[0];
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

public class Solution {
    int a=9;
    final int[] b={4};
    public static void d ( int a,  final int b[]){
        a++;
      b[0]++;
    }
    public static void main(String[] args) {
        System.out.println(CLCalculator.ch);
        System.out.println(GoogleKickStart.CLCalculator.ch);


        
    }
}