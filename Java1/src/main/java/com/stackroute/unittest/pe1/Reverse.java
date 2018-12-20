import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){

// declaring string objects
        String revStr= " " ;
        Scanner in= new Scanner(System.in);
        //input the string
        System.out.println("enter the string: ");
        String str= in.next();

        //get the length of the string
        int len= str.length();

        //code to be reverse the string
        for(int i= len-1;i>=0;i--)
            revStr= revStr+ str.charAt(i);

        //print the reverse string

        System.out.println("Reverse string is: " +revStr);

    }
}
