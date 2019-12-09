import com.sun.security.jgss.InquireSecContextPermission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class PlayGround {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String strums = "9 7 4 5 1 3 2";
        System.out.println(highAndLow(strums));
    }

    // Learn Java Streams
    // Learn Java Map

    public static int DuplicateCount(String text){
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
        Arrays.stream(text.toLowerCase().split("")).forEach(l -> {
            if(dictionary.containsKey(l)){
                dictionary.put(l, dictionary.get(l) + 1);
            } else {
                dictionary.put(l, 1);
            }
        });
        return (int)Arrays.stream(dictionary.keySet().toArray()).filter(k -> dictionary.get(k) > 1).count();
    }

    public static String highAndLow(String numbers) {
        var streamFirst = Arrays.stream(numbers.split(" "));
        var streamSecond = Arrays.stream(numbers.split(" "));
        String least = streamSecond.reduce(String.valueOf(Integer.MAX_VALUE), (a,b) -> Integer.parseInt(a) < Integer.parseInt(b) ? a : b);
        String greatest = streamFirst.reduce(String.valueOf(Integer.MIN_VALUE), (a,b) -> Integer.parseInt(a) > Integer.parseInt(b) ? a : b);
        return greatest + " " + least;
    }
}

// shortcut

// sout: System.out.println