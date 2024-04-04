package winsoft;

import java.util.HashMap;

// Write a Java Program to count the number of words in a string using HashMap.

public class assignment3 {
    public static HashMap<String, Integer> countWords(String str) {
       
        String[] words = str.split("\\s+");
       
        HashMap<String, Integer> wordCountMap = new HashMap<>();
       
        for (String word : words) {
           
            word = word.toLowerCase();
          
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }

    public static void main(String[] args) {
        String inputString = "My name is Harshal Lokhande. I am from Pune. I am a fresher who is pursuing a Bachelor degree in Computer from SPPU.";
        
        HashMap<String, Integer> wordCounts = countWords(inputString);
        
        System.out.println("Word Counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
    
}
