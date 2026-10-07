public class Ascending{
    public static void main(String[]args){
        int int1 = Integer.parseInt(args[0]);
        int int2 = Integer.parseInt(args[1]);
        int int3 = Integer.parseInt(args[2]);

        boolean ascending = ((int1 < int2) & (int2 < int3));
        boolean sequential = ((int2 == (int1 + 1)) && (int3 == (int2 + 1)));

        System.out.print("Are they ascending?: " + ascending);
        System.out.print("\nAre they sequential?: " + sequential);

    }
}