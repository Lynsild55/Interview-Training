package main.task_layout;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        if (n.length() == 1) {
            return Integer.parseInt(n);
        }
        
        String concatenation = n;
        if (k != 0) { concatenation = new String(new char[k]).replace("\0", n); }
        
        System.out.println("test1 " + concatenation);
        int result = 0;
        String[] splitNumber = concatenation.split("");
        for (int i = 0; i < splitNumber.length; i++) {
            result += Integer.parseInt(splitNumber[i]);
            System.out.println("test2 " + result);
        }
    
        return superDigit(result + "", 0);
    }
    
    //helper function to find the superDigit (number = 122, output = 1 + 2 + 2 = 5)
    public static int findSimpleSuperDigit(int number){
        String numberString = number + "";
        String[] splitNumber = numberString.split("");
        int result = 0;
        for (int i = 0; i < splitNumber.length; i++) {
            result += Integer.parseInt(splitNumber[i]);
        }
        return result;
    }

}