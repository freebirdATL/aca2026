public class Fourteen{
    public static void main(String[] args){
        System.out.println("Hello!");
        System.out.println("Welcome to the babysitting business!\n    The price of the babysitting is $14 an hour, with an additional $2 an hour for each extra child.");
        System.out.println("    Your first input should be how many children you have.");
        System.out.println("    Your second input should be how many hours of babysitting you need.");
        System.out.print("Your total cost is $");
        System.out.print((Integer.parseInt(args[0]) * 2 + 12) * Integer.parseInt(args[1]));
        System.out.println("!\nThanks for your business!!!");
    }
}