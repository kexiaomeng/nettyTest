import org.junit.ClassRule;

import java.io.*;

public class Test {

    class MyResource implements  AutoCloseable{


        @Override
        public void close() {
            System.out.println("方法关闭");
        }
    }

    @org.junit.Test
    public void test1() {
        try(
            MyResource resource = new MyResource()) {

            System.out.println(111);
        }
    }



}
