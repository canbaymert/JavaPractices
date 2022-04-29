package _14_varargs;

public class C01_sumAndMultiply {
    public static void main(String[] args) {


    int multiplier =5;
    int num1=5;
    int num2=6;
    int num3=100;
    int num4=1;
    int num5=26;
        sumandmultiply(multiplier,num1,num2,num3,num4,num5);
}
    public static void sumandmultiply(int multiplier, int... nums) {
        int sum=0;
        multiplier=1;
        for (int each:nums
        ) {
            sum+=each;
        }
        multiplier=multiplier*sum;
        System.out.println(multiplier);
    }
}

