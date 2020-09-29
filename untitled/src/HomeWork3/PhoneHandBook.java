package HomeWork3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PhoneHandBook {

    private HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer number) {
        try {
            this.phoneBook.get(name).add(number);
        } catch (NullPointerException e) {
            HashSet<Integer> hashSet = new HashSet<>();
            hashSet.add(number);
            this.phoneBook.put(name, hashSet);
        }
    }
    public void get(String name) {
        try {
            System.out.println(this.phoneBook.get(name));
        } catch (NullPointerException e) {
            System.out.println("Нет элементов в массиве");
        }
    }



    public static void main(String[] args) {
        PhoneHandBook phoneHandBook = new PhoneHandBook();

        phoneHandBook.add("Ssdas", 44555);
        phoneHandBook.add("Ssdas", 44557);
        phoneHandBook.add("Ssdas", 44557);
        phoneHandBook.add("Ssdaasdas", 44557);
        phoneHandBook.add("Ssdaafasf", 4454547);
        phoneHandBook.add("Ssdaafasf", 4454547);


        System.out.println(phoneHandBook.phoneBook);
        phoneHandBook.get("Ssdas");

    }


}
