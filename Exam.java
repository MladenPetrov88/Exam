import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinute = examHour * 60 + examMinutes;
        int arriveTimeInMinutes = arriveHour * 60 + arriveMinutes;
        int diff = examTimeInMinute - arriveTimeInMinutes;
        int hour = Math.abs(diff) / 60;
        int mins = Math.abs(diff) % 60;
        if (diff <0) {
            System.out.println("Late");

            if (Math.abs(diff) >= 60) {
                if (mins < 10) {
                    System.out.printf("%d:0%d hours after the start",hour,mins);
                } else {
                    System.out.printf("%d:%d hours after the start", hour, mins);
                }
            } else {
                System.out.printf("%d minutes after the start", mins);
            }
        } else if (diff >= 0 && diff <= 30) {
            if (diff == 0) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", mins);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                if (mins < 10) {
                    System.out.printf("%d:0%d hours before the start",hour,mins);
                } else {
                    System.out.printf("%d:%d hours before the start",hour,mins);

                }

            } else {
                System.out.printf("%d minutes before the start", mins);
            }
        }

    }
}
