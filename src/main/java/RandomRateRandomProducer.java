//import java.util.ArrayList;
//import java.util.Random;
//
//public class RandomRateRandomProducer implements Producer{
//    private Random value_first = new Random();
//    private Random r = new Random(); //ФУНКЦИЯ РАНДОМ
//    private Random t = new Random();
//    private Thread thread3;
//    private double value;
//
//
//    public void runProduction() {
//        thread3 = new Thread(new Runnable() { //создаем поток
//            public void run() { //ОН ВЫПОЛНИТСЯ ОДИН РАЗ, ПОЭТОМУ ДЕЛАЕМ ЦИКЛ while
//                value = value_first.nextDouble()*15;
//                System.out.println("First value = " + value);
//                while (true) {
//                    try {
//                        Thread.sleep(2000+t.nextInt(5000));
//                    } catch (InterruptedException e) { //цикл продолжится если даже есть ошибка
//                        e.printStackTrace();
//                    }
//                    value += r.nextDouble() * 20; //next double дает от 0 до 1
//                    if (value > 100) {
//                        value = 100;
//                    }
//                    System.out.println("value P3 = " + value);
//                }
//            }
//        });
//        thread3.start(); //
//    }
//
//    public double getPrice(int boughtValue) {
//        if (value >= boughtValue) {
//            return (100 - value) * 2;
//        }
//        else {
//            return -1;
//        }
//    }
//
//    public double buy(int boughtValue) {
//        this.value -= boughtValue;
//        return value;
//    }
//}
