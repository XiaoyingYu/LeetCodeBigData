package week1;

import java.util.HashSet;
import java.util.Set;

public class LC128 {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res = 0;
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);

                int l = num-1;
                int r = num +1;

                while(set.contains(l)){
                    set.remove(l);
                    l--;
                }
                while(set.contains(r)){
                    set.remove(r);
                    r++;
                }
                res= Math.max(res,r-l-1);

            }
        }
        return res;

    }
}
