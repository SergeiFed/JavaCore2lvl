package HomeWork2;

public class MyArrayDataException extends NumberFormatException{

  private String stringException;

  public String getNumber() {
    return stringException;
  }

  public MyArrayDataException(String s) {
    super(s);
  }

  public MyArrayDataException(String s, String stringException) {
    super(s);
    this.stringException = stringException;
  }
}
