import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double a = 2.389;
        double b = 3.1;
        double c = 17;



        double x = Math.sqrt(Math.pow(b,3)/b-a) - Math.abs(a);
        System.out.println("Результат: " + x);


        double y = a * Math.pow(Math.asin(c), 3) + b * Math.pow(Math.cos(c),3);
        System.out.println("Результат: " + y);
    }
}