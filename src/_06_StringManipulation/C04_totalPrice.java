package _06_StringManipulation;

public class C04_totalPrice {
    public static void main(String[] args) {
        String str1="€ 13.99";
        String str2="€ 10.55";
        System.out.println("Price of 1st product : "+str1);
        System.out.println("Price of 2nd product : "+str2);

        str1=str1.replaceAll("€","");
        str2=str2.replaceAll("€","");
        double str1double= Double.parseDouble(str1);
        double str2double= Double.parseDouble(str2);
        double total =(str1double+str2double);
        System.out.println("Total Price : € "+total);
    }
}
