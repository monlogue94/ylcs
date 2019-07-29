
package mybatis.xc;
import java.util.Timer;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        //开启一个进程
        new LatchDemo1().start();

        //开启2个进程
        //for (int i = 0; i < 5; i++) {
            //new LatchDemo1().start();
        //}


        //开启1000个进程
        //for (int i = 0; i < 1000; i++) {
            //new LatchDemo1().start();
       // }


        //开启10000个进程
        //for (int i = 0; i < 10000; i++) {
            //new LatchDemo1().start();
        //}
    }
}