package atm;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class Handler {
    private Handler next;
    public void process_with_capacity(int price, int capacity){
        Handler next = getNext();
        if (price % capacity > 0 && next == null){
            throw new IllegalArgumentException();
        }
        else if(next != null){
            getNext().process(price % capacity);
        }
        System.out.println(price / capacity + " * " + capacity);
    };
    public abstract void process(int price);
}
