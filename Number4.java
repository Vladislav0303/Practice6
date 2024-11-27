import java.util.Arrays;

public class Number4 {
    public static void main(String[] args) {
        int[][] gradys = new int[10][11];
        int gradysu = 0;
        for(int i = 0; i < gradys.length; ++i) {
            for(int j = 0; j < gradys[i].length; ++j) {
                double radians = Math.toRadians(gradysu);
                double sin = Math.sin(radians);
                gradysu += 1;
                System.out.print("  " + sin);
            }
            System.out.println();
        }
    }
}
