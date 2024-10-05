package easy;


import java.util.*;

class SolutionTransform {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int tempArr[] = Arrays.copyOf(arr,len);
        Arrays.sort(tempArr);
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<len;i++){
//            if(list.indexOf(tempArr[i])==-1)
//                list.add(tempArr[i]);
//        }
//        int ans[] = new int[len];
//        for(int i=0;i<len;i++){
//
//            ans[i] = list.indexOf(arr[i])+1;
//        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(tempArr[0],1);
        for(int i=1;i<len;i++){
            if(tempArr[i]>tempArr[i-1]){
                map.put(tempArr[i],map.get(tempArr[i-1])+1);
            } else {
                map.put(tempArr[i],map.get(tempArr[i-1]));
            }
        }
        int ans[] = new int[len];
        for(int i=0;i<len;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}

public class RankTransform {
    public static void main(String[] args) {
        int arr[] = {};
        SolutionTransform solution = new SolutionTransform();
        System.out.println(Arrays.toString(solution.arrayRankTransform(arr)));
    }
}
