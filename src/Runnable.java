/**
 * Created by ivan_ on 2015/3/16.
 */
public class Runnable implements java.lang.Runnable {

    private volatile Boolean flag = true;

    private int i;

    public Runnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (flag) {
            if (i > 0) {
                String name = Thread.currentThread().getName();
                synchronized (this) {
                    System.out.println(i-- + "---->" + name);
                }
            } else {
                flag = false;
            }
        }
    }

}
