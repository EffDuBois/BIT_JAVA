package assignment_5;

import java.util.Scanner;
public class height {
    public static void main(String[] args){
        int h1, h2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your heights in inches");
        h1=sc.nextInt();
        h2=sc.nextInt();
        heightPrinter(h1);
        heightPrinter(h2);
        heightCompare(h1, h2);
    }

    private static void heightCompare(int h1, int h2) {
        if (h1 > h2)
            System.out.println("Person #1 is taller");
        else if (h2 > h1)
            System.out.println("Person #2 is taller");
        else 
            System.out.println("Both are equal");
    }

    private static void heightPrinter(int h) {
        System.out.println("Height in feet and inches " + (h /12) + " " + (h%12));
        if (h >72)
            System.out.println("you are tall");
        else if (h <63)
            System.out.println("you are short");
        else
            System.out.println("you are medium");
    }
}
