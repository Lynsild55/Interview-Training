package main.task_2;

import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.size(); i++) {
            long temp = 0;
            for (int n = 0; n < 4; n++) {
                temp += arr.get((i+n)%5);
            }
            if (min > temp || min == 0) {
                min = temp;
            } else if (max < temp|| max == 0) {
                max = temp;
            }
        }
        System.out.println(min + " " + max);

    }

}