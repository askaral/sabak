import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 1;
        for(int b = 1; b<=a; b++)
        {sum = sum * b;
            System.out.print(" * "+b);
        }System.out.println(" = "+sum);
 //int Sfetafor = scanner.nextInt();
 //switch(Sfetafor){
    // case 4,5,9,10,14,15,19,20,24,25,29,30,
      //  34,35,39,40,44,45,49,50,54,55,59,60:
       //  System.out.println("Red");
     //break;
       // default:
       // System.out.println(" Green");
 //int a = scanner.nextInt();
 //switch (a){
    // case 1:
         //System.out.println("bir");
        // break;

 }
 //int b = scanner.nextInt();
        // System.out.println( a > 50 ? "ottunuz" : "kaldynyz");
    }