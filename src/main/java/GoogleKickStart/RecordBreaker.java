package GoogleKickStart;
//KickStartGoogle ******************************2022

import java.util.*;

public class RecordBreaker {


    public static int numberOfRecordBreakingDays(int numberOfDays, int[] visitors) {
        int recordBreakingDays = 0;
        int recordBreaker = 0;
        for (int i = 0; i < visitors.length; i++) {
            if (1 == visitors.length) {
                recordBreakingDays++;
                break;
            }
            if (i == visitors.length - 1) {
                if (recordBreaker == 0 && visitors[visitors.length - 1] != visitors[0]) {
                    recordBreakingDays++;

                    break;
                } else if (recordBreakingDays != 0 && visitors[visitors.length - 1] > recordBreaker) {
                    recordBreakingDays++;
                    break;

                }
            } else {
                if (visitors[i] > recordBreaker && visitors[i] > visitors[i + 1]) {
                    recordBreakingDays++;
                    recordBreaker = visitors[i];
                }
            }
        }


        return recordBreakingDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get number of test cases in input
        int testCaseCount = scanner.nextInt();
        // Iterate through test cases
        for (int tc = 1; tc <= testCaseCount; ++tc) {
            // Get number of days for this test case
            int numberOfDays = scanner.nextInt();
            // Get attendance for each day
            int[] visitorsPerDay = new int[numberOfDays];
            for (int d = 0; d < numberOfDays; ++d) {
                visitorsPerDay[d] = scanner.nextInt();
            }
            // Print results
            int answer = numberOfRecordBreakingDays(numberOfDays, visitorsPerDay);
            System.out.println("Case #" + tc + ": " + answer);
        }
    }
}
