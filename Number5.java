import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву: ");
        sc.nextInt();
        Random random = new Random();
        int[] mass = new int[5];
        for(int i = 0; i < mass.length; ++i) {
            mass[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(mass));

        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Оберіть опцію: 1 - зростає, 2 - спадає ");
        int chose = sc1.nextInt();
        switch (chose) {
            case 1:
                System.out.printf("Зростає ");
                break;
            case 2:
                System.out.printf("Спадає ");
                break;
        }
        for(int num : mass) {
            if (num > 0) {
                System.out.printf("Зростає ");
            } else if (num < 0) {
                System.out.printf("Спадає ");
            }
        }
    }
}
