package synchronized_1;

/** TODO synchronized - синхронизирует работу потоков, когда 2 или более потоков пишут в одну переменную
 * synchronized используется в методах
 * Только один поток, в один момент времент, получает доступ к выполнению тела метода
 * только одному потоку разрешается исполнение метода, все остальные потоки ждут
 */
/*
Ключевое слово volatile гарантирует, что у всех потоков будет одинаковая версия одной переменной.
Но это ключевое слово не блокирует переменную, когда поток записывает новую информацию в нее.
Поэтому volatile есть смысл использовать только тогда, когда ОДИН поток ПИШЕТ в переменную, а все остальные ЧИТАЮТ эту переменную.
Тогда, с помощью ключевого слова volatile у всех потоков будет одна и та же актуальная версия переменной.
Когда же более чем один поток ПИШУТ в одну и ту же переменную, volatile не поможет, надо использовать synchronized,
чтобы с переменной в один момент времени мог работать только один поток.
 */

public class Test3 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test3 test3 = new Test3();
        test3.doWork();
    }

    public synchronized void increment_1(){
        counter++;
    }

    // другой способ записи synchronized
    public void increment_2(){
        synchronized (this) {   // синхронизированный блок длля конкретного объектаи. Позволяет ускорить работу програамы за счет синхронизации на разных объектах
            counter++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment_1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment_1();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Ожидание завершения потока
        thread2.join();

        System.out.println(counter);
    }

}
