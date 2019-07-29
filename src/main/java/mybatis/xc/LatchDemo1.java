package mybatis.xc;
import mybatis.mapper.UserMapperImpl;

import java.util.Timer;
import java.util.TimerTask;

public class LatchDemo1 extends Thread {
    static long time = System.currentTimeMillis();
    static long result = 0 ;
    static int count = 0;

    Timer timer = new Timer();
    Monitor monitor = new Monitor();

    @Override
    public void run() {
        UserMapperImpl userMapper = new UserMapperImpl();
       while (true){
            long start = System.currentTimeMillis();
            try {
                userMapper.findUserById(500000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                userMapper.deleteUser(40000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            count++;

            if((end - time)>1000 ){

                count=0;
                time=end;
                monitor.run();
            }

            monitor.add(1);



        }

    }

}