import java.util.*;

public class Main {

        public static void main(String[] args) {

            printUniqueChars(new String[]{"мама", "тато", "їж їжак желе"});
        }
        public static void printUniqueChars (String[] words){
            List<String> evenWords = new ArrayList<>();
            int counter = 0;
            for(String word: words){
                char[] chars                      = word.toCharArray();
                Map<Character, Integer> charCount = new HashMap<>();
                for(char ch : chars){
                    charCount.put(ch, charCount.getOrDefault(ch, 0)+1);

                }

                boolean isEven = false;
                for(Character ch: charCount.keySet()){
                    isEven = charCount.get(ch) % 2 == 0;
                    if(!isEven) break;

                }

                if(isEven) {
                    evenWords.add(word);
                    counter ++;
                    if (counter == 2)
                        break;

                }
            }
            Set<Character> uniqueChars = new HashSet<>();
            for (String word : evenWords){
                char[] chars = word.toCharArray();
                for(char ch : chars)
                    uniqueChars.add(ch);
            }
            System.out.println(uniqueChars);

        }

    }





