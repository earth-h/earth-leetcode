class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> nums1Set = new HashSet<>();
        for(int i: nums1) {
            nums1Set.add(i);
        }
        for(int i: nums2) {
            if(nums1Set.contains(i))
                result.add(i);
        }
        int[] res = new int[result.size()];
        int idx = 0;
        for(int i: result) {
            res[idx++] = i;
        }
        return res;
        //return Arrays.stream(result.toArray(new Integer[result.size()])).mapToInt(Integer::intValue).toArray();
    }
}