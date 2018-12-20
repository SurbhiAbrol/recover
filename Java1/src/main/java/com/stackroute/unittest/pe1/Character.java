import java.util.Scanner;
public class Character {

    public void checkchar()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ar[]=str.toCharArray();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]=='a'||ar[i]=='A'||ar[i]=='e'||ar[i]=='E'||ar[i]=='i'||ar[i]=='I'||ar[i]=='o'||ar[i]=='O'||ar[i]=='u'||ar[i]=='U')
            {
                System.out.print(" Vowel");
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                System.out.print("Error!!!");
            }
            else
            {
                System.out.print("Consonant");
            }
        }
    }
    public static void main(String args[]) {

        Character rf=new Character();
        rf.checkchar();

    }
}



