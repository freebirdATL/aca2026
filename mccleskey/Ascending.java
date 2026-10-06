public class Ascending{
    public static void main(String[]args){
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        int int3 = Integer.parseInt(args[2]);

        boolean result = ((int1 < int2) & (int2 < int3));
        
        System.out.print(result);

    }
}