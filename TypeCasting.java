public class TypeCasting {
    public static void main(String [] args){
      //  int --> double , char ->  int 
        int a = 10 ;
        double b = a ;
        System.out.println(a);
        System.out.println(b);   
      //  wideing typecasting 

        char ch = 'H';
        int x = ch;
        System.out.println(x);

       // int --> byte 

        double a =  10.75;
        int b = (int )a;
        System.out.println(a);
        System.out.println(b);


    //    int -> byte 

        int a = 130;
        byte b = (byte) a;
        System.out.println(b);

       // int -> char 

        int x = 69 ;
        char ch = (char)x;
        System.out.println(ch);



    }
}
