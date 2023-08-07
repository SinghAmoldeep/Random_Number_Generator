package JavaDsa;
import java.util.Scanner;
public class miniproject {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int) (Math.random() * 100);
        System.out.println("This is a game project where u will guess ");
        System.out.println("random generated number from 1 to 100 GOOD LUCK!!");
        int usernumber=0;
        System.out.println("Enter ur number");

        do {
            usernumber=sc.nextInt();

            if (usernumber == mynumber) {
                System.out.println("wow great bro u found the number :))");
                return;
            } else if (usernumber > mynumber) {
                System.out.println("oops bro ur number is kinda  big");
                System.out.println("try again!!");


            } else if(usernumber<mynumber){
                System.out.println("oops bro ur number is kinda small");
                System.out.println("try again!!");
            }


        }while(usernumber>0);
        System.out.println("ooh u got tired huh!! so the number was ");
        System.out.println(mynumber);
    }
}
