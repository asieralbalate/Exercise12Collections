import java.io.*;
import java.util.*;

public class Exercise12 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        Map<String, Integer> map = new HashMap<>();
        try {
            input = new BufferedReader(new FileReader(args[0]));
            String line = input.readLine();
            while ((line = input.readLine()) != null) {
                String[] items = line.split(",");
                Integer freq = map.get(items[6]);
                map.put(items[6], (freq == null) ? 1 : freq + 1);
            }
            Set<String> keys = map.keySet();
            List<Pair> list = new ArrayList<>();
            for (String key : keys) {
                list.add(new Pair(key, map.get(key)));
            }
            Collections.sort(list);
            Collections.reverse(list);
            for (Pair pair : list) {
                System.out.println(pair.a +);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
