package medium;

import java.util.Arrays;
import java.util.List;

public class SentenceSimilarity {

    // list1 size is always greater than list2
    public static boolean isSimilar(List<String> list1, List<String> list2){
        int prefixCount = 0;
        int suffixCount = 0;
//        if(!list1.get(0).equals(list2.get(0))){
//            return false;
//        }
//        for(int i=0;i<list2.size();i++){
//            if(list1.get(i).equals(list2.get(i))){
//                prefixCount++;
//            }else{
//                break;
//            }
//        }
        int n1 = list1.size();
        int n2 = list2.size();
        int start = 0;
        while(start<n2 && list1.get(start).equals(list2.get(start))){
            prefixCount++;
            start++;
        }
        int end = 0;
        while(end<n2 && list1.get(n1-end-1).equals(list2.get(n2-end-1))){
            suffixCount++;
            end++;
        }
        return prefixCount+suffixCount>=list2.size();

    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        List<String> list1 = Arrays.asList(sentence1.split(" "));
        List<String> list2 = Arrays.asList(sentence2.split(" "));
        if(list2.size()>list1.size()){
            return isSimilar(list2, list1);
        }else{
            return isSimilar(list1, list2);
        }
    }

    public static void main(String[] args) {
        SentenceSimilarity similarity = new SentenceSimilarity();
        System.out.println(similarity.areSentencesSimilar("My name is Haley", "My Haley"));
    }
}
