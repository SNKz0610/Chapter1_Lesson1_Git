import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int[] arrFirst = {1, 4, 5, 3, 7, 2, 4, 8, 4, 9};
    private static ArrayList<Integer> arrSecond;
    private static String uocSo = "";
    private static TimCapUocSo timCapUocSo;
    private static int uoc1 = 0, uoc2 = 0, phanTuI = 0;
    private static int position = 0;
    private static String[] arrChuoi;

    public static void main(String[] args) {
        for (int i = 0; i < arrFirst.length; i++) {
            timCapUocSo = new TimCapUocSo();
            uocSo = timCapUocSo.timCapUocSo(arrFirst[i]);
            if (uocSo.equals("")) {
                continue;
            } else {
                //Lay ra 3 so tu chuoi uoc so, bao gom 2 uoc va phan tu arr[i]
                arrChuoi = new String[3];
                arrChuoi = uocSo.split("-");
                uoc1 = Integer.parseInt(arrChuoi[0]);
                uoc2 = Integer.parseInt(arrChuoi[1]);
                phanTuI = Integer.parseInt(arrChuoi[2]);


                //Tim kiem trong mang ban dau cac so tren

                //Tim kiem phan tu arr[i]
                arrSecond = new ArrayList<Integer>(3);
                for (int j = 0; j < arrFirst.length; j++) {
                    if (arrFirst[j] == phanTuI) {
                        arrSecond.add(arrFirst[j]);
                        position = j;
                        break;
                    }
                }

                //Tim kiem 2 uoc so con lai
                for (int j = 0; j < arrFirst.length; j++) {
                    if ((arrFirst[j] == uoc1 || arrFirst[j] == uoc2) && arrSecond.size() < 3) {
                        arrSecond.add(arrFirst[j]);
                    }
                }

                if(arrSecond.size() == 3) {
                    for (int j = 0; j < arrSecond.size(); j++) {
                        System.out.println(arrSecond.get(j));
                    }
                    arrSecond.clear();
                    uocSo = "";
                    System.out.println();
                }
            }
        }
    }
}
