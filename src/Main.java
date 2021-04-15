import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int[] arrFirst = {1, 4, 5, 3, 7, 2, 4, 8, 4, 9};
    private static ArrayList<Integer> arrSecond;
    private static int tich;


    public static void main(String[] args) {
        tich = 1;
       arrSecond = new ArrayList<>(arrFirst.length);
        for (int i = 0; i < arrFirst.length; i++) {
            for (int j = 0; j < arrFirst.length; j++) {
                if(j != i){
                    tich *= arrFirst[j];
                } else {
                    continue;
                }
            }
            arrSecond.add(tich);
            tich = 1;
        }

        for (int i = 0; i < arrSecond.size(); i++) {
            System.out.print(arrSecond.get(i) + " ");
        }
    }
}
