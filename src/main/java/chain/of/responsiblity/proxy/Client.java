package chain.of.responsiblity.proxy;

/**
 * Created by Administrator on 2017/10/25.
 */
public class Client {
    public static void main(String[] args) {
        MoveAble m = new Tank();
        try {
            m.move();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
