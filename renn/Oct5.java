public class Oct5 {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt(args[0]);
        int children = Integer.parseInt(args[1]);
        
        System.out.print("The cost is: ");
        System.out.print(hours * 14 + 2 * hours * (children - 1));
        
    }
}