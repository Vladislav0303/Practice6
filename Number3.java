import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введіть розмір: ");
        int some_size = sc.nextInt();
        int[] mass = new int[some_size];
        for(int i = 0; i < mass.length; ++i) {
            mass[i] = random.nextInt();
            System.out.println(Arrays.toString(mass));
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введіть значення на яке потрібно замінити: ");
            mass[i] = sc1.nextInt();

        }
    }
}
