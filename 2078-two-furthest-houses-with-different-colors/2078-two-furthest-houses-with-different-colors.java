class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < colors.length; i++) {
            if(!map.containsKey(colors[i])) {
                for(int j = colors.length - 1; j > 0; j--) {
                    if(colors[i] != colors[j]) {
                        max = j - i > max ? j - i : max;
                        map.put(colors[i], j - i);
                        break;
                    }
                }
            }
        }
        
        return max;
    }
}