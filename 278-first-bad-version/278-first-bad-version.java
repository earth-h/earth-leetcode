/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //return firstBadVersion(1, n);
        
        int start = 1, end = n;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid) == false) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    public int firstBadVersion(int start, int end) {
        int mid = start + (end - start) / 2;
        if(isBadVersion(mid) == false && isBadVersion(mid + 1) == true) {
            return mid + 1;
        } else if(isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
            return mid;
        } else if(isBadVersion(mid) == false) {
            return firstBadVersion(mid + 1, end);
        } else {
            return firstBadVersion(start, mid - 1);
        }
    }
}