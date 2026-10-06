public class Ascending {
    public static void main(String[] args) {
        
        //Create 3 vars for the 3 args
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        int int3 = Integer.parseInt(args[2]);
       
        //Create the boolean var that is T or F
        boolean result = (int1 == int2 - 1) && (int2 == int3 - 1);
        
        //Print boolean var that was determined above
        System.out.print(result);
    }
}