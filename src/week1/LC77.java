package week1;

import java.util.ArrayList;
import java.util.List;

public class LC77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(k>n){
            return res;
        }
        dfs(1,n,k,new ArrayList<Integer>(),res);
        return res;

    }
    public void dfs(int index,int n ,int k, List<Integer>com,List<List<Integer>>res){
        if(k==0){
            res.add(new ArrayList<>(com));
            return;
        }
        for(int i =index;i<=n;i++){
            com.add(i);
            dfs(i+1,n,k-1,com,res);
            com.remove(com.size()-1);
        }
    }
}
