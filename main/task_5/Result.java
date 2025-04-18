package main.task_layout;

import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int matrixLength = arr.size();
        System.out.println(matrixLength);
    
        int LTR = 0;
        int RTL = 0;
            
        for (int j = 0; j < matrixLength; j++) {
            LTR += arr.get(j).get(j);
            RTL += arr.get(matrixLength - j - 1).get(j);
            System.out.println(arr.get(j).get(j));
            System.out.println(arr.get(matrixLength - j - 1).get(j));
        }
        if (LTR < RTL) {
            return RTL - LTR;
        } else {
            return LTR - RTL;
        }
    }

}
