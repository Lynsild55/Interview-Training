package main.task_layout;

public class Result {
    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

     public static String caesarCipher(String s, int k) {
        String original = "abcdefghijklmnopqrstuvwxyz";
        String encryptedString = "";
        //String regex = " ";
        //String[] alph = original.split(" ");
        
        String temp = "";
        int index = 0;
        boolean capitalLetter = false;
        for (int i = 0; i < s.length(); i++) {
            temp = s.substring(i, i + 1);
            capitalLetter = temp.charAt(0) >= 'A' && temp.charAt(0) <= 'Z';
            temp = temp.toLowerCase();
            if (Character.isAlphabetic(temp.charAt(0))) {
                index = (original.indexOf(temp) + k) % 26;
                
                System.out.println("test " + index + " --- " + temp);
                if (capitalLetter) {
                    encryptedString += original.substring(index,index + 1).toUpperCase();
                } else {
                    encryptedString += original.substring(index,index + 1).toLowerCase();
                }
            } else {
                System.out.println();
            encryptedString += temp;
            }
        } 
        
        return encryptedString;
    }

}
