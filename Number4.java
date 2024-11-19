import java.util.Arrays;

public class Number4 {
    public static void main(String[] args) {
        int[][] gradys = new int[10][11];
        int gradysu = 0;
        for(int i = 1; i < gradys.length; ++i) {
            for(int j = 1; j < gradys[i].length; ++j){
                gradysu += 1;
                System.out.printf("%5d ", gradysu);
            }
            System.out.println();
        }
    }
}
