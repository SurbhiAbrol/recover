import java.util.Scanner;

public class CheckPalindromeDemo{
    public static void main(String args[]){
        System.out.println("Enter the no. for which you want to check pallindrome");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp= num;
        int sum=0;
        int rem=0;

        while(num>0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(temp==sum) {
            System.out.println("It is a pallindrome");
            int r = 0;
            int s = 0;
            while (temp > 0) {
                r = temp % 10;
                temp = temp / 10;
                if (r % 2 == 0) {
                    s = s + r;
                }
            }
            if (s > 25)
                System.out.println("the sum for number is greater than 25");
            else
                System.out.println("the sum for the number is not greater than 25");
        }else{
            System.out.println("it is not a pallindrome");
            }
        }
    }
