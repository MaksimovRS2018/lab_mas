public class Main {
    public static void main(String[] args) {
        FixedRateRandomProducer p1 = new FixedRateRandomProducer(); //FixedRateRandomProducer
        p1.runProduction(1,0,0, "FixedRateRandomProducer");
        FixedRateRandomProducer p2 = new FixedRateRandomProducer(); //Random RateRandomProducer
        p2.runProduction(1,0,1, "Random RateRandomProducer");
        FixedRateRandomProducer p3 = new FixedRateRandomProducer(); // FixedRateProducer
        p3.runProduction(0,1,0, "FixedRateProducer");


        Consumer consumer = new ConsumerImp1();
        consumer.addProducer(p1);
        consumer.addProducer(p2);
        consumer.addProducer(p3);
        consumer.startConsuming();
    }
}
