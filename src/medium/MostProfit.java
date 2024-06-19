package medium;

import java.util.Arrays;

class ValueIndexPair implements Comparable<ValueIndexPair> {
    int value;
    int index;

    public ValueIndexPair(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(ValueIndexPair o) {
        return Integer.compare(this.value, o.value);
    }
}

class SolutionMost {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int gain = 0;
        ValueIndexPair[] valueIndexPair = new ValueIndexPair[difficulty.length];
        for (int i = 0; i < difficulty.length; i++) {
            valueIndexPair[i] = new ValueIndexPair(difficulty[i],i);
        }
        Arrays.sort(valueIndexPair);
        int j= 0,max=0;
        for (int i = 0; i < worker.length; i++) {
            int sustinable = worker[i];
//            for (int j = valueIndexPair.length-1; j >=0 ; j--) {
//                if(valueIndexPair[j].value<=sustinable){
//                    sustinable-=valueIndexPair[j].value;
//                    gain += profit[j];
//                }
//            }
            while(j<valueIndexPair.length && worker[i]>=valueIndexPair[j].index){
                max = Math.max(max, valueIndexPair[j++].value);
            }
            gain+=max;
        }
        return gain;
    }
}

public class MostProfit {
    public static void main(String[] args) {
        int[] dif = new int[]{2, 4, 6, 8, 10};
        int[] profit = new int[]{10, 20, 30, 40, 50};
        int[] work = new int[]{4, 5, 6, 7};
        SolutionMost solutionMost = new SolutionMost();
        System.out.println(solutionMost.maxProfitAssignment(dif, profit, work));
    }
}
