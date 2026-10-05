public class PotentialCost{
    public static void main(String[]args){
        int Hours = Integer.parseInt(args[0]);
        int Children = Integer.parseInt(args[1]);
        int Cost = (14 * Hours) + (2 * Hours *(Children - 1));

        System.out.print("\nThe cost of babysitting will be: $" + Cost);
        System.out.print("\n\n");


    }
}