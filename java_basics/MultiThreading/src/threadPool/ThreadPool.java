package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * TODO пример выполнения 5-и заданий для 2-х потоков (не явное создание потокв)
 */
public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // Пул потоков
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i)); // передали 5 заданий 2-м потокам
        }

        executorService.shutdown(); // выключает прием новых заданий для потоков и начинается выполнение (запуск потоков) заданий принятых в submit()
        System.out.println("All tasks submitted"); // просто показывает что все таски переданы и начали свое выполнение
        executorService.awaitTermination(1, TimeUnit.DAYS); // Сколько ожидать завершения потока. Поток vain здесь останавливается и ждет
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed");
    }
}

