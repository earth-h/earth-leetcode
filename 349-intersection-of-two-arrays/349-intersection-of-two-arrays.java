class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums1) {
            map.put(i, i);
        }
        for(int i: nums2) {
            if(map.containsKey(i))
                result.add(i);
        }
        return Arrays.stream(result.toArray(new Integer[result.size()])).mapToInt(Integer::intValue).toArray();
    }
}