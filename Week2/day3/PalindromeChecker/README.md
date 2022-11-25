# Palindrome Checker
## What is a palindrome
a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.

## The purpose
The purpose of this app is to check whether a word, phrase, or sequence is a palinddrome.

## Key code
```java
      String reverse = ""; //Empty array to store the reversed version of string
        word = word.replaceAll("[^a-zA-Z]", ""); //replaces all special characters with nothing - removes them
        for(int i = word.length()-1; i>=0; i--){ //Loops through the word in reverse
        reverse = reverse + word.charAt(i); //stores each character plus the previous characters in a variable
        }

        if(word.toLowerCase().equals((reverse.toLowerCase()))){ //Checks if the reverse word is the same as the inputted word
        System.out.println("The given string " + word + " is a palindrome");
        return true;
        }else{
        System.out.println("The given string " + word + " is not a palindrome");
        return false;
        }

```