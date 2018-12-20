import java.util.Scanner;
public class Integer {
    public static void main(String args[]){
       System.out.println("enter  -1 to stop entering the number else continue entering ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
       int sum=0;
        while(num !=0) {
            sum = sum + num;
            num = sc.nextInt();
        }
           System.out.println("the sum of all the integer is:" + " "+sum);
        }
    }

