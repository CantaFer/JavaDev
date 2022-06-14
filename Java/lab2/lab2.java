package Java.lab2;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;


public class lab2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        System.out.println("Enter c: ");
        int c = input.nextInt();
        triangle ABC = new triangle();
        boolean check = ABC.check(a, b, c);
        if (check == ABC.False){
            System.out.println("Triangle does not exist");
        }
        else {
            while() {
                System.out.println("Choose Method to use: ");
                System.out.println("Enter 1 to find S");
                System.out.println("Enter 2 to find P");

            }
        }



    }
}
