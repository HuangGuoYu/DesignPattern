package chain.of.responsiblity.iterator;

/**
 * Created by AXT on 2017/10/25.
 */
public class ArrayList {
    Object[] objects = new Object[10];
    int index = 0;
    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects = new Object[objects.length * 2];
            //copy the old array to newArray
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
         objects[index] = o;
        index++;
    }


    public int size() {
        return index;
    }
}
