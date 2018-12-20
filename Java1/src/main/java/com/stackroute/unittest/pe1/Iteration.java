import java.util.Scanner;
public class Iteration {
    public static void main(String args[]){
        System.out.println("Enter the Iteration u want");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<i;j++){
                System.out.println(i);
            }
        }
    }
}
