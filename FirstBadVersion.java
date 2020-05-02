/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start =1, end = n;
       
       while (start < end) {
           int mid = start+(end-start)/2;
           if(isBadVersion(mid))
               end = mid;  //Check for left of mid
           else 
               start = mid+1; //check for right of mid
       }
        return start;
    }
}





