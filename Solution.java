package hello;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        if(num==null){
            return list1;
        }
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            if(num[i]>0){
                break;
            }
            if(i!=0 && num[i]==num[i-1]){
                continue;
            }
            for(int j=i+1;j<num.length-1;j++){
                if(j!=i+1 && num[j]==num[j-1]){
                    continue;
                }
                for(int k=j+1;k<num.length;k++){
                    if(k!=j+1 && num[k]==num[k-1]){
                        continue;
                    }
                    int sum=num[i]+num[j]+num[k];
                    if(sum==0){
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        list1.add(list);
                    }
                }
            }
        }
        return list1;
    }
}
