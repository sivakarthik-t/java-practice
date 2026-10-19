import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int r;
         int rev;

     while(n>0){
        r=n%10;
        rev=r*10+r;
        n=n/10;
        System.out.print(r);
     }
    }
    
    }