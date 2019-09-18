import java.util.Random;

public class FixedRateRandomProducer  implements Producer{
    private double value = 0;
    private Random r = new Random(); //ФУНКЦИЯ РАНДОМ
    private Thread thread1;

    public void runProduction(int k1, int k2, int t, String args) {

        thread1 = new Thread(new Runnable() { //создаем поток
            public void run() { //ОН ВЫПОЛНИТСЯ ОДИН РАЗ, ПОЭТОМУ ДЕЛАЕМ ЦИКЛ while
                while (true) {
                    try {
                        Thread.sleep(2000+r.nextInt(5000)*t);
                    } catch (InterruptedException e) { //цикл продолжится если даже есть ошибка
                        e.printStackTrace();
                    }
                    value += r.nextDouble() * 20*k1+11*k2; //next double дает от 0 до 1
                    if (value > 100) {
                        value = 100;
//                        t = false;
                    }
                    System.out.println("value " + value + " " +args);
                }
            }
        });
        thread1.start(); //
    }

    public double getPrice(int boughtValue) {
        if (value >= boughtValue) {
//            System.out.println("Price = "+(100-value)*2);
            return (100 - value) * 2;
        }
        else {
            return -1;
        }
    }



    public double buy(int boughtValue) {
        this.value -= boughtValue;
        return value;
    }
}
