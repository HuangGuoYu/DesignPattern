package chain.of.responsiblity.iterator;

/**
 * Created by AXT on 2017/10/25.
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        Collection list = new ArrayList();
        for (int i=0;i<15;i++) {
            list.add(new Object());
        }
        System.out.println(list.size());

        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
