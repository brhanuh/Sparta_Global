package org.example;

public class CountWords {
    public static int CountAWord(String [] arr, char letter){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].charAt(0) == letter){
                System.out.println(arr[i].charAt(0));
                sum += 1;
            }
        }
        return sum;
    }

    public static int countWordsInString(String sentence, char letter){
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        System.out.println(words[0] + " " + words[1]);
        int sum = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].charAt(0) == letter){
                sum += 1;
            }
        }
        return sum;
    }
}
