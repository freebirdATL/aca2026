public class sitting {
    public static void main(String[] args){
        //be able to do this:
        //(14 * hours) + (# of additional children * (2 * hours))
        System.out.print("\n");
        System.out.print("For " + args[0] + " hour(s), with " + args[1] + " additional children, babysitting will cost:");
        System.out.print("\n");
        System.out.print("$" + ((Integer.parseInt(args[0]) * 14) + (Integer.parseInt(args[1]) * 2)));
        System.out.print("\n");
    }   
}