package lesson1;

/**TODO  1. есть 2 способа создания потока: а) унаследоваться от класса Thread б) реализовать интерфейс Runnable
 2. В методе run() описывается что должно происходить в потоке
 3. Метод start() вызывает создание потока и выполняет описанное в методе run()
 4. Метод sleep() указывает насколько заснуть потоку, в милисекундах (должны быть обработаны исключения)
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();   // Создает новый поток и выполняет описанное в методе run()

        Thread.sleep(100);

        MyThread myThread2 = new MyThread();
        myThread2.start();   // Создает новый поток и выполняет описанное в методе run()

        System.out.println("Hello from main");

        Thread thread = new Thread(new Runner()); // ещё один способ создания потока
        thread.start();
    }

}

class MyThread extends Thread {
    @Override
    public void run() { // Здесь описывается то, что должно выполниться в потоке
        // super.run();
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my Thread - " + i);
        }
    }
}