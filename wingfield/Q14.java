public class Q14 {
    public static void main(String[] args) {
    System.out.print("Welcome!\n\n For 1 child the price is $14 per hour and $2 is added to the rate for every child added. If you want to find your rate input the amount of children you want babysat and for how long type the number of children first, then the hours.\n\n" );
    System.out.print("$");
    System.out.print(Integer.parseInt(args[1]) * (12 + (Integer.parseInt(args[0]) * 2)));
    }
}