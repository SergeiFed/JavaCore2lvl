package HomeWork2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

  private int number;

  public int getNumber() {
    return number;
  }

  public MyArraySizeException(String s) {
    super(s);
  }

  public MyArraySizeException(String s, int number) {
    super(s);
    this.number = number;
  }

}
