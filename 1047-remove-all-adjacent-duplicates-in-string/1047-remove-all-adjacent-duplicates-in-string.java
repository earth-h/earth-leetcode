class Solution {
    public String removeDuplicates(String s) {
        String[] stringArray = s.split("");
        List<String> strList = new ArrayList<>();
        int idx = 0;
        for(idx = 0; idx < stringArray.length - 1; idx++) {
            if(stringArray[idx].equals(stringArray[idx + 1])) {
                idx++;
                continue;
            }
            if(strList.size() == 0 || !(strList.get(strList.size() - 1).equals(stringArray[idx]))) {
                strList.add(stringArray[idx]);
            } else {
                strList.remove(strList.size() - 1);
            }
        }
        if(idx < stringArray.length) {
            if(strList.size() == 0 || !(strList.get(strList.size() - 1).equals(stringArray[idx]))) {
                strList.add(stringArray[idx]);
            } else {
                strList.remove(strList.size() - 1);
            }
        }
        return String.join("", strList);
    }
}