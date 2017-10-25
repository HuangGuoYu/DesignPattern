package chain.of.responsiblity.proxy;

import java.util.Random;

/**
 * Created by Administrator on 2017/10/25.
 */
public class Tank implements MoveAble {
    public void move() throws InterruptedException {
        System.out.println("tank moving");
        Thread.sleep(new Random().nextInt(1000));
    }
}
