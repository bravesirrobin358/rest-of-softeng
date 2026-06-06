public class Main {
 
    public static void main(String[] args)
    {
        // Make an instance of demo class
        Demo obj = new Demo();
 
        // Thread t1 will call part1()
        Thread t1 = new Thread(new Runnable() {
            public void run() { obj.part1(); }
        });
 
        // Thread t2 will call part2()
        Thread t2 = new Thread(new Runnable() {
            public void run() { obj.part2(); }
        });
 
        // Start t2 and then t1
        t2.start();
        t1.start();
 
        // This is a counter which will
        // interrupt Thread t2 after 3 seconds
        long startTime = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - startTime
                > 3000)
                t2.interrupt();
        }
    }
}