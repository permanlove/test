public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Runnable runnable = new Runnable(10);
        Thread thread = new Thread(runnable, "runnable");
        Thread thread1 = new Thread(runnable, "runnable1");

        thread.start();
        thread1.start();
    }
}
