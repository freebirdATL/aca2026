public class Babysit {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int children = Integer.parseInt(args[1]);

        int hourlyRate = 14 + (children * 2);
        int totalPay = hours * hourlyRate;

        System.out.println("Total pay: $" + totalPay);
    }
}