import java.util.Map.Entry;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        for(String s: s1.split(" ")) {
            if(map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for(String s: s2.split(" ")) {
            if(map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        
        /*
        * WARNING: The Security Manager is deprecated and will be removed in a future release
        * java.util.ConcurrentModificationException
        * https://javarevisited.blogspot.com/2017/08/how-to-remove-key-value-pair-from-map-iteration-java-example.html#axzz7N88KZPny
        */
        // for(String key: map.keySet()) {
        //     System.out.println(key);
        //     if(map.get(key) > 1) 
        //         map.remove(key);
        // }
        
//         Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
//         while(iter.hasNext()) {
//             Entry<String, Integer> entry = iter.next();
//             if(entry.getValue() > 1)
//                 iter.remove();
//         }
        
//         return map.keySet().toArray(new String[map.size()]);
        
        List<String> result = new ArrayList<>();
        for(String key: map.keySet()) {
            if(map.get(key) == 1)
                result.add(key);
        }
        return result.toArray(new String[result.size()]);
    }
}