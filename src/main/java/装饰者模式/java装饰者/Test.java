package 装饰者模式.java装饰者;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Lynn
 * @since 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/diaodanfeng/Documents/codes/设计模式/src/main/java/装饰者模式/java装饰者/test.txt")));
            while ((c = in.read())>=0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
