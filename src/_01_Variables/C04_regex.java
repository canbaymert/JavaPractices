package _01_Variables;

public class C04_regex {
    public static void main(String[] args) {
        String b = "Java 1235 ?!@$_";
        System.out.println(b);
        //output:Java 1235 ?!@$_
        System.out.println(b.replaceAll("\\d", "*"));
        //output:Java **** ?!@$_
        System.out.println(b.replaceAll("\\D", "*"));
        //output *****1235******
        System.out.println(b.replaceAll("\\S", "*"));
        //output:**** **** *****
        System.out.println(b.replaceAll("\\s", "*"));
        //output Java*1235*?!@$_
        System.out.println(b.replace(" ", "*"));
        //output Java*1235*?!@$_
        System.out.println(b.replaceAll("\\w", "*"));
        // output:**** **** ?!@$*  (w includes  a-z A-Z 0-9)
        System.out.println(b.replaceAll("\\W", "*"));
        // output:Java*1235*****_

        System.out.println("as".matches(".s"));  // true
        System.out.println("mst".matches(".s")); // false
        System.out.println("mas".matches("..s")); // true
        System.out.println("a".matches("[a]")); // true, string should consist of one character which is a
        System.out.println("ab".matches("[ab]")); // false, string should consist of one character which can be a or b

        System.out.println("a".matches("[^a]")); // false, string should consist of one character except of a
        System.out.println("c".matches("[^ab]")); // true, string should consist of one character except of a and b
        System.out.println("abcd".matches("[abcd]")); // false,  string should consist of one character which can be a,b,c or d
        System.out.println("c".matches("[abcd]")); // true, string should consist of one character which can be a,b,c or d

        System.out.println("c".matches("[a-z]")); // true, string should consist of one character which is between a and z
        System.out.println("A".matches("[a-zA-Z]")); // true, string should consist of one character which is between a and z or A and Z
        System.out.println("c".matches("[1-9]")); // false, string should consist of one character which is between 1 and 9

        System.out.println("a".matches("[abc]?")); // true max usage of a, b, c should be 1.
        System.out.println("aaa".matches("[abc]?")); // false, max usage of a, b, c should be 1.
        System.out.println("".matches("[abc]?")); // true, max usage of a, b, c should be 1.
        System.out.println("b".matches("[abc]?")); // true, max usage of a, b, c should be 1.
        System.out.println("a".matches("[abc]+")); // true, min usage of a, b, c should be 1.
        System.out.println("aaa".matches("[abc]+")); // true, min usage of a, b, c should be 1.
        System.out.println("aaddta".matches("[abc]+")); // false, string should grade contain d or t
        System.out.println("aaabbcccc".matches("[abc]+")); // true, max usage of a, b, c should be 1.

        System.out.println("asdaf13".matches("[a-zA-Z0-9]{6}")); // true, string should contain 6 characters
        System.out.println("xxasdaf23".matches("[a-zA-Z0-9]{6}")); // false string should grade contain more than 6 characters
        System.out.println("RA2uc8".matches("[a-zA-Z0-9]{6}")); // true
        System.out.println("asda$2".matches("[a-zA-Z0-9]{6}")); // false, string should grade contain special characters
        System.out.println("+++++" + "ttc25z".matches("[a-zA-Z0-9]{6,7}")); // true
        System.out.println("ttc25et0".matches("[a-zA-Z0-9]{6,7}")); // false, string should grade contain 6 or 7 characters
        System.out.println("9953038949".matches("[789]{1}[0-9]{9}"));   // true, first character should be 7,8 or 9, total 10 characters
        System.out.println("9953038949".matches("[789][0-9]{9}"));      //true
        System.out.println("6953038949".matches("[789][0-9]{9}")); // false, first character is 6
        System.out.println("99530389490".matches("[789][0-9]{9}")); // false, sting should grade contain more or less than 10 characters
    }
}

