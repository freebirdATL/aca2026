public class Cost {
    public static void main(String[] args) {
        // args[0] is children and args[1] is the hours
        double children = (Double.parseDouble(args[0]) - 1.0);
        System.out.print(((children * 2) + 14) * Double.parseDouble(args[1]));
    }
}