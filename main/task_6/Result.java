package main.task_layout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0)); 
        for (int i = 0; i < arr.size(); i++) {
            result.set(arr.get(i), result.get(arr.get(i)) + 1);
        }
        
        return result;

    }
}
