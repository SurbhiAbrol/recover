import java.util.Scanner;
public class CheckCondition {
    public static void main(String args[]) {
        System.out.println("Enter the integer");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 20 && num < 30) {
            if ( num % 2 == 0){
                System.out.println("Tom");

            }
            else{
                System.out.println("Jerry");
            }

        }
    }
}
