public class Ascending {
    public static void main(String[]args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result = ((a < b) & (b < c));
        boolean sequence = ((a == b-1) & (b == (a+1)) & (c == b+1));
        System.out.print(result & sequence);
    }
}