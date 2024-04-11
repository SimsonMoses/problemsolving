package easy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

class SolutionUnable{

}


public class NumberOfstudentUnableToEat {

    private static Logger log = Logger.getLogger("Number");

    public static int countStudents(int[] students, int[] sandwiches){
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> sand = new PriorityQueue<>();
        for(int s:students){
            queue.add(s);
        }
        for(int s:sandwiches){
            sand.add(s);
        }
        int total = 0;
        while(!queue.isEmpty()){
            int topEle = sand.peek();
            int firstStudent = queue.peek();
            if(topEle==firstStudent){
                sand.poll();
                queue.poll();
                total--;
            }else{
                firstStudent = queue.poll();
                queue.add(firstStudent);
                total++;
            }
            if(total>=queue.size()){
                break;
            }
        }
        return queue.size();
    }

    public static void main(String[] args) {
        int student[] = new int[]{1,0,0,1};
        int sand[] = new int[]{1,1,0,1};
        System.out.println(countStudents(student,sand));
    }
}
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/?envType=daily-question&envId=2024-04-08