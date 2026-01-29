import java.util.Scanner;

public class Himanshu{

    // Even or odd  without % mod operator 

    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur number");
        int n = sc.nextInt();

        if((n/2) * 2==n){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
