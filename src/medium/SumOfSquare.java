package medium;

class SolutionSquare {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=c/2;
        while(i<j){
            int number = (i*i)+(j*j);
            if(number==c){
                return true;
            }
            else if(number>c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}

public class SumOfSquare {
    public static void main(String[] args) {
        SolutionSquare solutionSquare = new SolutionSquare();
        System.out.println(solutionSquare.judgeSquareSum(1000000));
    }
}
