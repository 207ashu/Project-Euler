import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            
            long n = in.nextLong();
            long sumWholeSq=n*n*(n+1)*(n+1)/4;
            long sumOfSq=n*(n+1)*(2*n+1)/6;
            
            long res=Math.abs(sumWholeSq-sumOfSq);
            System.out.println(""+res);
            
        }
    }
}
