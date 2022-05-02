package _19_set;

import java.util.ArrayList;

public class C07_2DCollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Employee 1");
        employees.add("Employee 2");
        employees.add("Employee 3");
        employees.add("Employee 4");
        employees.add("Employee 5");


        ArrayList<String> employers = new ArrayList<>();
        employers.add("Employer 1");
        employers.add("Employer 2");
        employers.add("Employer 3");
        employers.add("Employer 4");
        employers.add("Employer 5");
        employers.add("Employer 6");

        ArrayList<String> companies = new ArrayList<>();
        companies.add("Amazon");
        companies.add("Google");
        companies.add("Siemens");
        companies.add("IBM");

        lists.add(employees);
        lists.add(employers);
        lists.add(companies);

        System.out.println(lists);
    }
}

