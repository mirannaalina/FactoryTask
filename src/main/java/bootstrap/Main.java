package bootstrap;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Adauga marimi");

        Scanner sc = new Scanner(System.in);


        Map<String, String> map = new HashMap<>();
        map.put("1",sc.nextLine());
        map.put("3",sc.nextLine());
        map.put("7",sc.nextLine());

        printMap(map);

        Map<String, String> treemap = new TreeMap<>(map);

        printMap(treemap);
    }


    public static void printMap(Map<String,String> sample){

        Map<String, String> newMapSortedByKey = sample.entrySet().stream()
                .sorted(Map.Entry.<String,String>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
