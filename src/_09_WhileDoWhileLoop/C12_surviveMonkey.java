package _09_WhileDoWhileLoop;

public class C12_surviveMonkey {

            /*

            There is a lonely monkey in the island.
            He needs to eat 4 bananas every day
            there are just 165 bananas in that island.
            Create following variables and find how many days.
            monkey can survive.
            Use do while loop, increment and decrement and if statements.
            int numberOfBananas =165, survivalDays = 1;
            boolean monkeyAlive = true;

            */

    public static void main(String[] args) {
        int numberOfBananas =165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

        do {
            System.out.println("Monkey needs to eat 4 bananas every day");
            numberOfBananas-=4;
            survivalDays++;
            if(numberOfBananas<4) {
                monkeyAlive =false;
                System.out.println("It's Day:" + survivalDays + ", There are no more bananas left and the monkey couldn't survive.");
            }else System.out.println("It's Day:" + survivalDays + ", The monkey is still alive.");

        }while (monkeyAlive);
        System.out.println("Total survival days : " + (survivalDays));
    }
}


