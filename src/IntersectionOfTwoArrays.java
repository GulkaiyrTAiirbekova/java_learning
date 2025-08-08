/*
new array= arrayList
n*m+log
 */

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int [] intersection(int[] nums1,int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        Set<Integer> set = new HashSet<Integer>();

        /*
        nums1 = [1,1,1,...1]
        nums2 = [1,1,1,..1]
         */
        for(int i = 0; i<n;i++) {
            for(int j=0; j<m;j++) {
                if(nums1[i] == nums2[j]) {
                    s.add(nums1[i]); //O(1) in average ( в среднеипочти за одну операцию работает (даже если 1000))
                    break;
                }
            }
        }
        //O(n * m)
        int[] answer = new int[set.size()];
        int [] answer = new int [set_size];
        int ind =0;
        for(Integer x:set) {
            answer[ind] = x;
            ind++;
        }
        //O(min(n,m))
    }
}


2. new array = ArrayListfor O ...
    for O ...m ->O(1)
