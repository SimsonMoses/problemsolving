package medium;

class SolutionNumber {
    public static int divide(int n){
        return n/2;
    }
    public static int add(int n){
        return n+1;
    }
    public int numSteps(String s) {
        int n = Integer.parseInt(s,2);
        int count = 0;
        while(n!=1){
            if(n%2==0){
                n = divide(n);
            }else{
                n = add(n);
            }
            count++;
            System.out.println("n : "+n);
            System.out.println(count);
        }
        return count;
    }
}
public class NumberReduceToOne {
    public static void main(String[] args) {
        SolutionNumber solutionNumber = new SolutionNumber();
        System.out.println(solutionNumber.numSteps("1101"));
    }
}
