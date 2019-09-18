import java.util.ArrayList;
import java.util.List;

public class ConsumerImp1 implements Consumer {
    private List<Producer> producers = new ArrayList<>();
    private Thread r;

    @Override
    public void addProducer(Producer p) { //используется интерфейс для разных классов, но в данном случае класс один и тот же, интерфейс не имеет смысла
        producers.add(p);
}

    public void startConsuming() { //мы опрашиваем всех продюсеров
        r = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5001);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    double bestPrice = Double.MAX_VALUE; //1.7976931348623157E308//
                    Producer bestProducer = null;
                    for (Producer producer : producers) {
                        double price = producer.getPrice(50); //50 - количество
                        if (bestPrice > price && price != -1) {
//                            System.out.println("Kek = "+price);
                            bestProducer = producer;
                            bestPrice = price;
                        }
                    }
                    if (bestProducer != null) {
                        bestProducer.buy(50);
//                        System.out.println(" the value has been bought successfully from " + bestProducer +
//                                "\n price: " + bestPrice);
                        System.out.println(" the value has been bought successfully");

                    } else {
                        System.out.println(" the value can not be consumed");
                    }
                }

            }
        });
        r.start();
    }
}
