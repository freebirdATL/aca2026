public class Ascending{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        Boolean d = ((a <= b) && (b <= c));
        Boolean e = ((a+1 == b) && (b+1 == c));
        System.out.println(d && e);
    }
}