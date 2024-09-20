package Utility;

public class Myfunc {
    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
