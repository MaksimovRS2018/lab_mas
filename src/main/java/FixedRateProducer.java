//import java.util.ArrayList;
//
//public class FixedRateProducer implements Producer{
//    private double value = 0;
//    private Thread thread2;
//    @Override
//    public void runProduction() {
//        thread2 = new Thread(new Runnable() { //создаем поток
//            public void run() { //ОН ВЫПОЛНИТСЯ ОДИН РАЗ, ПОЭТОМУ ДЕЛАЕМ ЦИКЛ while
//                while (true) {
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) { //цикл продолжится если даже есть ошибка
//                        e.printStackTrace();
//                    }
//                    value += 11;
//                    if (value > 100) {
//                        value = 100;
//                    }
//                    System.out.println("value P2= " + value);
//                }
//            }
//        });
//        thread2.start(); //
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
//    @Override
//    public void runProduction(int k, int m, int h, String arf) {
//
//    }
//
//    public double buy(int boughtValue) {
//        this.value -= boughtValue;
//        return value;
//    }
//}
//
