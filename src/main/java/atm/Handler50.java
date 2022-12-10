package atm;

public class Handler50 extends Handler{
    public void process(int price) {
        process_with_capacity(price, 50);
    }
}
