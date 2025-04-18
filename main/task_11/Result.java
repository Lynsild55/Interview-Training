package main.task_layout;


class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    // without print statements
    public static String gridChallenge(List<String> grid) {
        
        int size = grid.size(); // number of rows
        int length = grid.get(0).length(); //numbers of collums
        
        if (size == 1 && length == 1) {return "YES";}
        
        // sorting Strings in the List
        List<String> sortedGrid = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            String input = grid.get(i);
            char[] chars = input.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            sortedGrid.add(sorted);
        }
        
        // looping the grid and comparing the elements in a nested for-loop
        String first = sortedGrid.get(0).substring(0, 1);
        String second = "";
        
        for (int i = 0; i < length; i++){
            for (int j = 0; j < size; j++) {
                first = sortedGrid.get(j).substring(i, i + 1);
                if (j < size - 1) {
                    second = sortedGrid.get(j + 1).substring(i, i + 1);
                }
                
                int test = first.compareTo(second);
                if (first.compareTo(second) > 0) {
                    return "NO";
                }
                first = second;
            }
        }
        return "YES";

    }

}


//with print statements
public static String gridChallenge2(List<String> grid) {
    System.out.println(grid);
    
    int size = grid.size(); // number of rows
    int length = grid.get(0).length(); //numbers of collums
    
    if (size == 1 && length == 1) {return "YES";}
    
    // sorting Strings in the List
    List<String> sortedGrid = new ArrayList<String>();
    for (int i = 0; i < size; i++) {
        String input = grid.get(i);
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        sortedGrid.add(sorted);
    }
    System.out.println("sorted list: " + sortedGrid);
    
    // looping the grid and comparing the elements in a nested for-loop
    
    String first = sortedGrid.get(0).substring(0, 1);
    String second = "";
    
    for (int i = 0; i < length; i++){
        for (int j = 0; j < size; j++) {
            first = sortedGrid.get(j).substring(i, i + 1);
            if (j < size - 1) {
                second = sortedGrid.get(j + 1).substring(i, i + 1);
            }
            
            int test = first.compareTo(second);
            System.out.println("test " + test);
            if (first.compareTo(second) > 0) {
                System.out.println(first + " -is not before- " + second);
                return "NO";
            }
            System.out.println(first + " -is good- " + second + " index: " + j + " and " + i);
            first = second;
        }
    }
    return "YES";

}







public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}