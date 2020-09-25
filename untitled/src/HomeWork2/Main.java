package HomeWork2;

public class Main {

  public static void main(String[] args) {

    String[][] array = {
        {"5", "5", "5", "gg"},
        {"5", "a", "5", "5",},
        {"5", "5", "a", "5",},
        {"5", "5", "5", "5",},
    };
    try {
      arraysParseInt(array);
    } catch (MyArraySizeException | MyArrayDataException e) {
      e.printStackTrace();
    }
    System.out.println("END");


  }

  public static String[][] arraysParseInt(String[][] array) {
    if (array.length > 4) {
      throw new MyArraySizeException(
          "length array.length > 4 на данный момент у вас " + array.length);
    }
    for (int i = 0; i < array.length; i++) {
      if (array[i].length > 4) {
        throw new MyArraySizeException(
            "length array[i].length > 4 на данный момент у вас " + array[i].length);
      }
      for (int j = 0; j < array[i].length; j++) {
        try {
          Integer integer = Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException("String не смог конвертировать в Integer ошибка произошла "
              + "в обработке " + array[i][j]);
        }

      }
    }

    return array;
  }
}
