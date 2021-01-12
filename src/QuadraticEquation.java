import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double getDiscriminant(){
        double delta;
        delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
        return delta;
    };

    private double [] giaiPhuongTrinh(double delta,double a,double b){
        double arr[] = new double[2];
        arr[0] = (-b + Math.sqrt(delta))/ (2 * a);
        arr[1] = (-b - Math.sqrt(delta))/ (2 * a);
        return arr;
    };

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b = sc.nextDouble();
        System.out.println("Enter the value of c: ");
        c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        double delta = qe.getDiscriminant();
        if (delta < 0){
            System.out.println("Phương trình vô nghiệm");
        } else {
            double result [] = qe.giaiPhuongTrinh(delta, a, b);
            System.out.println("Phương tình có 2 nghiệm là: " + Math.round(result[0]*1000000.0)/1000000.0 + " " + Math.round(result[1]*1000000.0)/1000000.0 );
        }
    }
}
