package lesson2;

import java.util.Scanner;

/** TODO volatile - позволяет настроить взаимодействие потоков
 *  когда 1 переменная делится между несколькими потоками, т.е. 1 поток пишет в переменную, а другой поток читает ее
 *  volatile - гарантирует когерентность КЕШей ядер,
 *      т.е. поток будет обращаться к главной памяти, чтобы взять свежее значение переменной, а не к КЕШу ядра процессора
 */
public class Test2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}
class MyThread extends Thread {
    private volatile boolean running = true; // volatile (изменчивый) - значение переменной может быть изменено (не надо ее КЕШировать)
    @Override
    public void run() {
        while(running){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }

}
