public class Ascending {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        boolean ascending = first < second && second < third;
        boolean sequential = second == first + 1 && third == second + 1;
        System.out.print(ascending && sequential);

    }
}