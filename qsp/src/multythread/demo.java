package multythread;
import java.io.*;;
public class demo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getPriority());
        System.out.println(t.getName());
        t.setName("newname");
        System.out.println(t.getName());
        System.out.println(t);
        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t.getPriority());
    }
}
