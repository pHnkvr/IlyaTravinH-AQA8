package test;

import java.util.Arrays;
import java.util.Scanner;

public class WeekPlaner {
    public static void main(String[] args) {
        WeekPlaner planner = new WeekPlaner();
        String[][] schedule = planner.getSchedule();
        planner.setGoals(schedule);
        System.out.println(Arrays.deepToString(schedule));
        planner.workWithSchedule(schedule);
    }

    public String[][] getSchedule() {
        String [][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        return schedule;
    }
public void setGoals(String[][] schedule){
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i<schedule.length;i++){
        System.out.println("Insert task for "+ schedule[i][0]);
        schedule[i][1] = scanner.nextLine();

    }

}
    public void workWithSchedule(String[][] schedule){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert day of a week: ");
        String dayOfWeek = scanner.nextLine();

        while (!dayOfWeek.equalsIgnoreCase("exit")){
            //change Monday
            if(dayOfWeek.contains("change")||dayOfWeek.contains("reschedule")){
                String day = dayOfWeek.split("\\s")[1];
                for (int i = 0; i<schedule.length;i++){
                    if (schedule[i][0].equalsIgnoreCase(day)){
                        System.out.println("Please enter task for "+schedule[i][0]);
                        schedule[i][1]=scanner.nextLine();
                        break;
                    }
                }
                dayOfWeek=day;
            }




            switch (dayOfWeek.toLowerCase()){
                case "sunday"-> System.out.println(schedule[0][1]);
                case "monday"-> System.out.println(schedule[1][1]);
                case "tuesday"-> System.out.println(schedule[2][1]);
                case "wednesday"-> System.out.println(schedule[3][1]);
                case "thursday"-> System.out.println(schedule[4][1]);
                case "friday"-> System.out.println(schedule[5][1]);
                case "saturday"-> System.out.println(schedule[6][1]);
                default -> System.out.println("Sorry, i don`t understand you");
            }
            System.out.println("Insert day of a week");
            dayOfWeek = scanner.nextLine();
        }
    }

}
