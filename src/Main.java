import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        String monthName = "";
        int days = 0;
        System.out.println("Enter the number of the month: ");
        int Month = userIn.nextInt();
        System.out.print("Enter the year: ");
        int Year = userIn.nextInt();


        switch (Month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
        }
        System.out.println("\n" + monthName +  ", " + Year + " has " + days + " Days.");
    }
}