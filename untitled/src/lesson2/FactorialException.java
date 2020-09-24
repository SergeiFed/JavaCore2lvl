package lesson2;

public class FactorialException extends IllegalArgumentException{
    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialException(int number) {
        this.number = number;
    }

    public FactorialException(String s, int number) {
        super(s);
        this.number = number;
    }
}
