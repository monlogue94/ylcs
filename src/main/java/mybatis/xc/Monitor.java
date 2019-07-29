package mybatis.xc;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Monitor extends TimerTask{

    private AtomicInteger atomicInteger = new AtomicInteger(0);
    public void add(int count){
         this.atomicInteger.addAndGet(count);
    }

    @Override
    public void run() {

        System.out.println("每秒执行次数"+atomicInteger);
        System.out.println("每次所需的时间"+(double) 1/atomicInteger.intValue());
        atomicInteger = new AtomicInteger(0);
    }


    public Monitor(){

    }

}
