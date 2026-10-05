public class BabySitting {
    public static void main(String[] args) {
        int Hours = Integer.parseInt(args[0]);
        int Children = Integer.parseInt(args[1]);
        System.out.print("It will cost you $" + ((Hours * 14) + (((Children - 1) * 2) * Hours)));
    }
}