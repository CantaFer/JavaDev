package Java.lab1;
import java.lang.*;
import java.util.*;
public class lab1 {
    public static void main(String[] args){
        double [] FinalAnswer = new double[3];
        Scanner input = new Scanner(System.in);
        double [] answer = new double[3];
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        answer[0] = a;
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        answer[1] = b;
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        answer[2] = c;
        int i;
        for (i = 0; i < 3; i++){
            if (answer[i] > 1 && answer[i] < 3){
                FinalAnswer[i] = answer[i];
            }
        }
        for (i = 0; i < FinalAnswer.length; i++){
            System.out.println(FinalAnswer[i]);
        }
    }
}
