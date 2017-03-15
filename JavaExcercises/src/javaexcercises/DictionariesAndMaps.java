/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcercises;

import java.util.*;
import java.io.*;

/**
 *
 * @author JC
 */
public class DictionariesAndMaps {
    
    public static void main(String []argh){
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            Map<String, Integer> directorio = new HashMap<>();
            
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                directorio.put(name, phone);
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here
                if (directorio.get(s) == null )
                    System.out.println("Not found");
                else
                    System.out.println(s + "=" + directorio.get(s));
            }
            in.close();
        }
    }
    
}
