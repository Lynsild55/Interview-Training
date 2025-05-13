package main.task_1;

import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int n = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        for (int i = 0; i < n; i++) {
            int current = arr.get(i);
            if (current > 0) {positive++;}
            else if (current < 0) {negative++;}
            else {zero++;}
        }
            if (positive != 0) {System.out.printf("%.6f\n", (double) positive / n);} 
            else {System.out.printf("%.6f\n", (double) 0);}       
            if (negative != 0) {System.out.printf("%.6f\n", (double) negative / n);}  
            else {System.out.printf("%.6f\n", (double) 0);}  
            if (zero != 0) {System.out.printf("%.6f\n", (double) zero / n);}
            else {System.out.printf("%.6f\n", (double) 0);}         
    }
}
