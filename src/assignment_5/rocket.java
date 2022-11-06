package assignment_5;

import java.nio.file.FileSystemNotFoundException;

public class rocket {
    public static void main(String[] args) {
        int size=4;
        for (int line = 1; line <= 2*size-1; line++) { //nose
            System.out.print(" ");
            space(2*size - line);
            slash(line);
            System.out.print("**");
            rSlash(line);
            System.out.println("");
        }
        bar(size);

        for(int  line=1; line<=size; line++){  // body stg1 pt1
            System.out.print(" |");
            dot(size-line*1);
            tri(line);
            dot(line*(-2)+2*size);
            tri(line);
            dot(size-line*1);
            System.out.println("|");
        }
        for (int line=size;line>=1;line--){    // body stg1 pt2
            System.out.print(" |");
            dot(size -line*1);
            invTri(line);
            dot(line*(-2)+2*size);
            invTri(line);
            dot(size-line*1);
            System.out.println("|");
        }
        bar(size);

        for (int line=size;line>=1;line--){    // body stg2 pt1
            System.out.print(" |");
            dot(size-line*1);
            invTri(line);
            dot(line*(-2)+2*size);
            invTri(line);
            dot(size-line*1);
            System.out.println("|");
        }

        for( int line=1; line<=size; line++){  // body stg2 pt2
            System.out.print(" |");
            dot(size-line*1);
            tri(line);
            dot(line*(-2)+2*size);
            tri(line);
            dot(size-line*1);
            System.out.println("|");
        }
        bar(size);

        for (int line = 1; line <= 2*size-1; line++) {     //tail
            System.out.print(" ");
            space(2*size - line);
            slash(line);
            System.out.print("**");
            rSlash(line);
            System.out.println("");
        }


    }
    static void space(int n) {
        for (int space = 1; space <= n; space++)
            System.out.print(" ");

    }
    static void slash(int n) {
        for (int slash = 1; slash <= n; slash++)
            System.out.print("/");
    }

    static void rSlash(int n) {
        for (int rslash=1;rslash<=n;rslash++)
            System.out.print("\\");
    }

    static void dot(int n) {
        for (int dot=1;dot<=n;dot++)
            System.out.print(".");
    }
    static void tri(int n) {
        for (int tri=1;tri<=n;tri++)
            System.out.print("/\\");
    }

    static void invTri(int n) {
        for (int tri=1;tri<=n;tri++)
            System.out.print("\\/");
    }

    static void bar(int size){
        System.out.print(" +");
        for (int line =1; line<= size*2; line++)
            System.out.print("=*");
        System.out.print("+");
        System.out.println("");
    }
}
