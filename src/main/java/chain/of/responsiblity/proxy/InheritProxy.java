package chain.of.responsiblity.proxy;

/**
 * Created by Administrator on 2017/10/25.
 */
public class InheritProxy extends Tank {
    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
