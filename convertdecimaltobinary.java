import java.util.Scanner;

public class Himanshu{

    // Find the largest of three numvbers without using Math.max 
/// if /else


// convert decimal to binary 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int binary = 0 , comp = 1 ;

        while(num>0){
            binary += (num % 2) * comp;
            comp*= 10;
            num/=2;
        }

        System.out.println("Binary=" + binary);


    }
}
