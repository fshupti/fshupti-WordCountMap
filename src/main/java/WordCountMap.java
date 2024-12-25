
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){

           // Instantiate a HashMap to store the word counts
           Map<String, Integer> wordMap = new HashMap<>();
        
           // Split the input string into an array of words
           String[] wordArray = words.split(" ");
           
           // Iterate through the array of words
           for (String word : wordArray) {
               // If the word already exists in the map, increment its count
               wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
           }
           
           // Return the completed map
           return wordMap;
       }
   
       public static void main(String[] args) {
           WordCountMap wcm = new WordCountMap();
           String input = "hello world hello everyone";
           Map<String, Integer> result = wcm.returnWordMap(input);
           System.out.println(result); // Expected Output: {hello=2, world=1, everyone=1}
       }
   }