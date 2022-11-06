package assignment_1;

import java.lang.Math;

public class rectangle {
    static int ax1,ax2,ay1,ay2,bx1,bx2,by1,by2;

    public static void main(String[] args){

        int arA,arB,peA,peB,AsideX,AsideY,BsideX,BsideY;

        ax1=Integer.parseInt(args[0]);
        ay1=Integer.parseInt(args[1]);
        ax2=Integer.parseInt(args[2]);
        ay2=Integer.parseInt(args[3]);
        bx1=Integer.parseInt(args[4]);
        by1=Integer.parseInt(args[5]);
        bx2=Integer.parseInt(args[6]);
        by2=Integer.parseInt(args[7]);

        AsideX = Math.abs(ax2-ax1);
        AsideY = Math.abs(ay2-ay1);

        BsideX = Math.abs(bx2-bx1);
        BsideY = Math.abs(by2-by1);

        arA= AsideX*AsideY;
        arB= BsideX*BsideY;
        peA= 2*(AsideX+AsideY);
        peB= 2*(BsideX*BsideY);
        if (intersect()){
            if (arA>arB)
                System.out.println("the winner is B! (contained in A)");
            else if (arA<arB)
                System.out.println("the winner is A! (contained in B)");
            else
                System.out.println("tie (equal areas)");
        }
        else {
            if (arA>arB && peA>peB) {
                System.out.println("the winner is A! (Bigger in area and perimeter");
            } else if (arA<arB && peA<peB) {
                System.out.println("the winner is B! (Bigger in area and perimeter");
            }
            else
                System.out.println("tie");
        }
    }

    static boolean intersect () {
        if ((ax1 >= bx1 && ax1<= bx2 || ax1 <= bx1 && ax1 >= bx2)||(ax2 >= bx1 && ax2<= bx2 || ax2 <= bx1 && ax2 >= bx2)){
            if ((ay1 >= by1 && ay1 <= by2 || ay1 <= by1 && ay1 >= by2)||(ay2 >= by1 && ay2 <= by2 || ay2 <= by1 && ay2 >= by2))
                return true;
        }
        return false;
    }
}
