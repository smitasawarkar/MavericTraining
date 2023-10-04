package com.maveric.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartLetterRUsingStram {

	public static void main(String[] args) {
        List<String> name = Arrays.asList("Pooja","Smita","Komal","Ram","Amrita");
        
       
       
        List<String> showname = name.stream().filter(n->n.startsWith("R")).collect(Collectors.toList());

         System.out.println(showname);
        
         List<String> showUppName = name.stream().filter(n->n.startsWith("R")).map(p->p.toUpperCase()).collect(Collectors.toList());

         System.out.println(showUppName); 
}


}
