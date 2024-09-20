package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SolutionLemonade {
    public boolean lemonadeChange(int[] bills) {
        List<Integer> kalla = new ArrayList<>();
        for(int n : bills){
            if(n==5){
                kalla.add(n);
                Collections.sort(kalla,Collections.reverseOrder());
                continue;
            }else if(n>5){
                if(kalla.isEmpty())
                    return false;
                int bln = n-5;
                int rupe = 0;
                List<Integer> blnnote = new ArrayList<>();
                for(int i = 0;i<kalla.size();i++){
                    if(kalla.get(i)<=bln){
                        blnnote.add(kalla.get(i));
                        bln+= kalla.get(i);
                    }
                }
                if(rupe==bln){
                    kalla.removeAll(blnnote);
                    kalla.add(n);

                }
            }
        }
        return true;
    }
}

public class Lemonade {
    public static void main(String[] args) {
        SolutionLemonade solutionLemonade = new SolutionLemonade();
        int[] list = new int[]{5,5,5,10,20};
        var data = solutionLemonade.lemonadeChange(list);
        System.out.println(data);

    }
}
