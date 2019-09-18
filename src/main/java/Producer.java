public interface Producer {
//    double price = 10; такого не надо
    void runProduction(int k, int m, int h, String arf);
    double buy(int value);
    double getPrice(int value);
}
