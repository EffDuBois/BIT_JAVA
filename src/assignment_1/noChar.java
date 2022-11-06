package assignment_1;

public class noChar {
    public static void main(String[] args){
        int i,j,count;
        char ch;
        String str="",h="#";
        for (i=0;i< args.length;i++){
            str=str.concat(args[i]);
        }
        char[] charArray = str.toUpperCase().toCharArray();
        for (i=0;i<charArray.length;i++){
            if (charArray[i]==0) {continue;}
            ch=charArray[i];
            count=1;
            for (j=i+1;j<charArray.length;j++) {
                if (charArray[j] == ch) {
                    charArray[j] = 0;
                    count++;
                }
            }
            System.out.println(ch + h.repeat(count));
        }
    }
}
