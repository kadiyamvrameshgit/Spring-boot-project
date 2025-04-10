package com.connectors.main_application.Controller;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args){
        HashMap<String, Employee> employeeHashMap = new HashMap<>();

        LinkedHashMap<String, Employee> collect = employeeHashMap.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().salary()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int[] arr= new int[]{1, 0, 0, 1, 2, 1, 2, 0, 1, 1, 1};
        sortArray(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void sortArray(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            switch (arr[mid]) {
                case 0:
                    swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid++, high--);
                    break;
            }

            }
        }

    public static void swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}

record Employee(String name, long id, double salary){}
