package assignment_1;

public class avg {
    public static void main(String[] args) {
        int sum=0,i,avg;
        for (i=0;i< args.length;i++){
            System.out.print(args[i] + " ");
            sum+=Integer.parseInt(args[i]);
        }
        avg=sum/args.length;
        System.out.println("avg=" + avg);

    }
}
