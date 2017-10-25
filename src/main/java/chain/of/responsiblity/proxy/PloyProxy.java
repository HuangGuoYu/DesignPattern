package chain.of.responsiblity.proxy;

/**
 * Created by Administrator on 2017/10/25.
 */
public class PloyProxy implements  MoveAble {
    private Tank tank;

    public PloyProxy(Tank tank) {
        this.tank = tank;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
