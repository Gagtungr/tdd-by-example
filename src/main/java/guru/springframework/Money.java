package guru.springframework;

public class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return amount == ((Money)obj).amount &&
                this.getClass().equals(obj.getClass());
    }

}
