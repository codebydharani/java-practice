import java.util.Scanner;
public class LargestThree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c ){
            System.out.print("A is Largest");
        }
        else if(b>=a && b>=c){
            System.out.print("B is largest");
        }
        else{
            System.out.print("C is largest");
        }
    }
}