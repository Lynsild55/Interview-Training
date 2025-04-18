package main.task_layout;

class Result {

    /*
     * snakegrid challenge
     *
     */

    public static String gridChallenge(List<String> grid) {
        System.out.println(grid);
        
        int size = grid.size(); // number of rows
        int length = grid.get(0).length(); //numbers of collums
        
        // sorting Strings in the List
        List<String> sortedGrid = new ArrayList<String>();
        for (int i = 0; i < grid.size(); i++) {
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
        
        for (int i = 0; i < sortedGrid.get(0).length(); i++){
            for (int j = 0; j < grid.size(); j++) {
                if(j == 0 && i == 0) { j++; }
                
                second = sortedGrid.get(j).substring(i, i + 1);
                
                int test = first.compareTo(second);
                System.out.println("test " + test);
                if (first.compareTo(second) == -1) {
                    System.out.println(first + " -is not before- " + second);
                    return "NO";
                }
                System.out.println(first + " -is good- " + second + " index: " + j + " and " + i);
                first = second;
                //if (i == length - 1 && j == size - 1) { return "YES";}
            }
        }
        return "YES";

    }

}