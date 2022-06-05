package _17_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ioException {
    public static void main(String[] args) {
        String path = "src/_17_exceptions/ErrorsAndExceptionsCheatSheet.jpg";
        try {
            FileInputStream fis = new FileInputStream(path);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
