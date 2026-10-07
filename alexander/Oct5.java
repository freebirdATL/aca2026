public class Oct5 {
    public static void main(String[] args) {
       
        int hours = Integer.parseInt(args[0]);
        int children = Integer.parseInt(args[1]);
       
        System.out.println("The cost is $" + (14 + (2 * (children - 1))) * hours);
    }
}