/*##############################################################################
 # Date : 11/26/20, 1:52 PM
 # Author : Razvii Andre
 # HackerRank Profile : https://www.hackerrank.com/Razvii
 # Github Profile : https://github.com/razviiandre
 # Linkedin Profile : https://www.linkedin.com/in/lungu-razvan-andre-4858a417b
 #############################################################################*/

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Day8DictionaresAndMaps {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
//        Map<String,Integer> phoneBook = new HashMap<>();
//        ConcurrentHashMap<String, Integer> phoneBook = new ConcurrentHashMap<>();
//        Dictionary<String,Integer> phoneBook = new Hashtable<>();
        LinkedHashMap<String,Integer> phoneBook = new LinkedHashMap<>();
        int n = IN.nextInt();


        for(int i = 0 ; i < n ; i++){
            String name = IN.next();
            int phone = IN.nextInt();
            phoneBook.put(name,phone);
        }

        while(IN.hasNext()){
            String find = IN.next();

//            if(phoneBook.get(find) != null){
//
//            } else {
//                System.out.println("Not found");
//            }

            if(phoneBook.containsKey(find)){
                for(Entry<String, Integer> entry : phoneBook.entrySet()){
                    if(find.equals(entry.getKey())){
                        System.out.println(entry.getKey()+"="+entry.getValue());
                    }
                }
            } else {
                System.out.println("Not found");
            }


        }

    }
}
