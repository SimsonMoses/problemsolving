package testing;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        double amt = 500;
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        while(day>=0){
            amt = amt + amt*0.1;
            day--;
        }
        System.out.println(amt);
    }
}
