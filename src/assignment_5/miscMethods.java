package assignment_5;
import java.util.Date;
import java.util.Scanner;


public class miscMethods {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("Choose 1. Weather Checker 2. Largest Number 3. First day 4. exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1 : weatherChecker();
            return;
            case 2 : System.out.println(largestNumber());
            return;
            case 3 : firstDay();
            return;
            case 4 : System.exit(0);
            default: System.out.println("Starting the loop again");
            main(args);
        }

    }

    private static int largestNumber() {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b) {
            if (a>c)
                return a;
            else
                return c;
        }
        else {
            if (b > c)
                return b;
            else
                return c;
        }
    }

    private static void firstDay() {
        int d1, m1, d2, m2;
        System.out.println("Enter the date in dd mm dd mm format");
        d1=sc.nextInt();
        m1=sc.nextInt();
        d2=sc.nextInt();
        m2=sc.nextInt();
        if (m1<m2)
            System.out.println("First date is before");
        else if (m1>m2) {
            System.out.println("Second date is before");
        }
        else {
            if (d1>d2)
                System.out.println("Second date is before");
            else if (d1<d2) {
                System.out.println("First date is before");
            }
            else
                System.out.println("Both are the same date");
        }
    }


    public static void weatherChecker() {
        int temp;
        boolean rain;
        System.out.println("Enter the temperature");
        temp =  sc.nextInt();
        System.out.println("Is it raining - true / false");
        rain = sc.nextBoolean();
        if (rain){
            if (temp>=70 && temp<= 110)
                System.out.println("Weather is good");
            else
                System.out.println("Weather is not good");
        } else {
            if (temp >= 40 && temp <= 100)
                System.out.println("Weather is good");
            else
                System.out.println("Weather is not good");
        }
    }
}
