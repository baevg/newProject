package lesson1;

public class Runner implements Runnable {
    @Override
    public void run() {
        for(int i = 9; i < 500;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from Runner - " + i);

        }
    }
}
