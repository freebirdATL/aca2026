    public class Product{
        public static void main(String[]args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean ascending = (a< b && b <c)&&(a > b && b >c);
        System.out.print(ascending);
        System.out.print("\n");

    }
}