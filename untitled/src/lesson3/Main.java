package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(45);

        System.out.println(list);

//        for (Integer x : list) {
//            System.out.println(x);
//        }

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }


//        list.add(1, 10);
//        list.addAll(2, Arrays.asList(2, 5, 1));
//
//        System.out.println(list);
//        list.remove((Integer) 2);
//        System.out.println(list);

//        list.removeIf(x -> x<=2);
//        list.removeAll(Arrays.asList(2, 5, 1));
//        System.out.println(list);

//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());
//        list.sort(Comparator.comparing((x -> x % 10)));

//        list.replaceAll(x -> x + 2);
//        System.out.println(list);
//
//        ((ArrayList<Integer>) list).ensureCapacity(1600);
//        ((ArrayList<Integer>) list).trimToSize();
//
//        Random random = new Random();

//        long b = System.currentTimeMillis();
//        for (int i = 0; i < 1000; i++) {
//            list.add(0,random.nextInt(1000));
//        }
//        long e = System.currentTimeMillis();
//        System.out.println("time: " + (e - b));
//

//        System.out.println(linkedList);


//        Queue<String> queue = new LinkedList<>();
//        queue.offer("A");
//        queue.offer("B");
//        queue.offer("C");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(queue.poll());
//        }


//        LinkedList<String> stack = new LinkedList<>();
//        stack.push("A");
//        stack.push("B");
//        stack.push("C");
//
//        for (int i = 0; i <3 ; i++) {
//            System.out.println(stack.pop());
//        }


//        List<Integer> linkedList = new LinkedList<>();


//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
//
//        set.addAll(Arrays.asList(22, 5, 44, 22, 3, 44, 5, 5, 22));
//        set.add(44);
//        System.out.println(set);

//        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        Set<Integer> setB = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));
//
//        System.out.println("A= " + setA);
//        System.out.println("B= " + setB);
//
////        setA.retainAll(setB);
////        System.out.println("A ^ B = " + setA);
//
////        setA.addAll(setB);
////        System.out.println("A v B = " + setA);
//
//        setA.removeAll(setB);
//        System.out.println("A ^ -B = " + setA);


//        Map<String, Integer> map = new HashMap<>();
////        Map<String, Integer> map = new LinkedHashMap<>();
////        Map<String, Integer> map = new TreeMap<>();
//
//        map.put("Barsik", 3);
//        map.put("Murzik", 6);
//        map.put("Amurik", 2);
//        map.put("Barsik", 5);
//        System.out.println(map);
//
//        System.out.println(map.get("Murzik"));

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        map.forEach((k, v) -> {
//            System.out.println("key= " + k + " value= " + v);
//        });

//        Random random = new Random();
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < 100; i++) {
//            int val = random.nextInt(10);
//            Integer count = hm.getOrDefault(val,0);
//            hm.put(val, count + 1);
//        }
//        System.out.println(hm);
//
//        Map<Integer, List<String>> map;
    }
}
