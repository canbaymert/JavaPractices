package _15_StringBuilder;

public class C01_methods {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java is good");
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println("sb1 length : " + sb1.length()); // 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16
        sb1.trimToSize();
        System.out.println("sb1 capacity : " + sb1.capacity()); // 0
        sb2.append("one");
        System.out.println(sb2); // Java is supersonic
        sb2.append(1).append(true);
        System.out.println(sb2); // Java is supersonic1true
        System.out.println(sb2.indexOf("good")); //8
        System.out.println(sb2.toString().toUpperCase()); //JAVA IS GOODSONIC1TRUE (temporary)
        System.out.println(sb2); //Java is goodone1true
        System.out.println(sb2.delete(0, 5));//is goodone1true
        System.out.println(sb2.deleteCharAt(0));//s goodone1true
        sb3.append("s goodone1true");
        System.out.println(sb3.compareTo(sb2)); // works as equals method in String, returns 0 if they're equal
        System.out.println(sb3.reverse()); // eurt1enodoog s
        System.out.println(sb3.substring(3, 5)); // t1 (temporary)
        System.out.println(sb3.subSequence(0, 1)); // e (temporary)
        System.out.println(sb3); //eurt1enodoog s
    }
}
