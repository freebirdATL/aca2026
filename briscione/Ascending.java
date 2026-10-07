public class Ascending{
    public static void main(String[] args){
        int firstnum = Integer.parseInt(args[0]);
        int secondnum = Integer.parseInt(args[1]);
        int thirdnum = Integer.parseInt(args[2]);
        boolean Ascending = firstnum < secondnum && thirdnum > secondnum;
        boolean will = secondnum == firstnum +1 && thirdnum == secondnum + 1;
        System.out.print(Ascending && will);
    }
}