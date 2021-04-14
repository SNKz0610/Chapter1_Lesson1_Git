public class TimCapUocSo {
    private String uocSo ="";
    private int check = 0;
    public String timCapUocSo(int i){
        for (int j = 2; j <= i/2; j++) {
            for (int k = 2; k <= j ; k++) {
                if(j * k == i){
                    uocSo += j+ "-" +k+ "-" +i;
                    check++;
                    break;
                }
            }
            if(check !=0){
                break;
            }
        }
        return uocSo;
    }
}
