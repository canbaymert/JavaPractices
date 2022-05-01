package _13_dateTime.printHappyUser;


public class _01_Runner extends _03_Registration {

    /*

    Register new users to a new list
    If an user register in the first 10 seconds of a minute add this user to the happylist

    */

    public static void main(String[] args) {
        while (true) {
            userlist = register();
            System.out.println("User List : " + userlist);
            System.out.println("Happylist : " + happylist);
        }
    }
}

