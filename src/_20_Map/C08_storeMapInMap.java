package _20_Map;

import java.util.HashMap;
import java.util.Scanner;

public class C08_storeMapInMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, HashMap<String,String>> personnelList = new HashMap<>();
        String choice;

        do {
            HashMap<String,String> personnelInfo = new HashMap<>();
            System.out.print("Your name and surname : ");
            personnelInfo.put("Name", scan.nextLine());
            System.out.print("Your address:");
            personnelInfo.put("Address", scan.nextLine());
            System.out.print("Your Phone Number :");
            personnelInfo.put("Phone", scan.nextLine());
            System.out.print("Your ID number :");
            personnelList.put(scan.nextInt(),personnelInfo);

            scan.nextLine(); // dummy

            System.out.println("Personnel Information = " + personnelInfo);
            System.out.println("Personnel List = " + personnelList);
            System.out.print("Do you want to continue : Y/N");
            choice=scan.nextLine();
        } while(choice.equalsIgnoreCase("y"));

        System.out.print("Enter the ID number of an employee : ");
        System.out.println(personnelList.get(scan.nextInt()));
    }
}

