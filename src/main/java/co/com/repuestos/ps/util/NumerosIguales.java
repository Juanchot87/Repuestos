package co.com.repuestos.ps.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumerosIguales {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(9);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        System.out.println("Números duplicados:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}