package mapsDemo;

//It is similar to HashMap, but is synchronized.
//Hashtable stores key/value pair in hash table.
//In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
//The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
//HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.

//import java.io.*; 
import java.util.*;   

class AddElementsToHashtable { 
    public static void main(String args[]) 
    { 
        // No need to mention the 
        // Generic type twice 
        Hashtable<Integer, String> ht1  = new Hashtable<>(4, 0.75f); 
  
        // Initialization of a Hashtable 
        // using Generics 
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(3, 0.5f); 
  
        // Inserting the Elements 
        // using put() method 
        ht1.put(1, "one"); 
        ht1.put(2, "two"); 
        ht1.put(3, "three"); 
  
        ht2.put(4, "four"); 
        ht2.put(5, "five"); 
        ht2.put(6, "six"); 
  
        // Print mappings to the console 
        System.out.println("Mappings of ht1 : " + ht1); 
        System.out.println("Mappings of ht2 : " + ht2); 
    } 
}
