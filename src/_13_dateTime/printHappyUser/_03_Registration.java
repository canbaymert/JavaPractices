package _13_dateTime.C04_printHappyUser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_Registration {
    static Scanner scan=new Scanner(System.in);
    static ArrayList<String> userlist= new ArrayList<>();
    static ArrayList<String> happylist = new ArrayList<>();


    public static ArrayList register() {
        System.out.print("Please enter your username : ");
        _02_User obj=new _02_User();
        obj.name=scan.nextLine();
        obj.registerationdate = LocalDateTime.now();
        obj.registerationsecond=obj.registerationdate.getSecond();
        addhappyuser(obj.registerationsecond,obj.name);
        userlist.add(obj.name);
        return userlist;
    }

    private static void addhappyuser(int registerationsecond,String name) {
        if(registerationsecond<=10) happylist.add(name);
    }
}
