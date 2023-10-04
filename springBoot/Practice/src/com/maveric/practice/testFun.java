package com.maveric.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testFun {

	public static void main(String[] args) {
      //  List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(10,20,30,33,2,5,6,7,3,22,53,19,9,4,6,10,2,3,8,34,88);
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//        numbers.add(11);
//        numbers.add(12);
//        numbers.add(13);
//        numbers.add(14);
//        numbers.add(15);
//        numbers.add(16);
//        numbers.add(17);
//        numbers.add(18);
//        numbers.add(19);
//        numbers.add(20);
        List<Integer> evenlist = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());

         System.out.println(evenlist);
        
         int sumOfEvenNo = evenlist.stream().mapToInt(Integer::intValue).sum();
         System.out.println(sumOfEvenNo);
         
        double avglist= evenlist.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("list Average : "+avglist);
        
        //using partitioningBy
        Map<Boolean, List<Integer>> divbythree=numbers.stream().collect(Collectors.partitioningBy(n->n%3==0));
        System.out.println("list divisible by three using partitioningBy: "+divbythree);
      
        // using summarizingInt   
      IntSummaryStatistics getbythree=numbers.stream()
    		  .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("list getAverage using summarizingInt: "+getbythree.getAverage());
        System.out.println("list getCount using summarizingInt: "+getbythree.getCount());
        System.out.println("list getSum using summarizingInt: "+getbythree.getSum());
        System.out.println("list getMax using summarizingInt: "+getbythree.getMax());
        System.out.println("list getMin using summarizingInt: "+getbythree.getMin());
        
        
        
        
        
        
//        List<Integer> ssss=numbers.stream().collect(Collectors.partitioningBy(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .get());
//        System.out.println("list divisible by three using partitioningBy: "+ssss);
//        
        
        List<Integer> sortedList= numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("get Sorted  list : "+sortedList);
       
        int secondLarge= numbers.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("get second Largest number  : "+secondLarge);
       
        int secondSmallest= numbers.stream().sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println("get second Smallest number  : "+secondSmallest);
        
        
	}

}