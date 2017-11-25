package com.jcourse.melnikov;

import java.io.*;
import java.nio.charset.Charset;

public class MyClass {
    public static void main(String[] args) throws IOException {
        String test = new String("testing".getBytes(), Charset.forName("UTF-8"));
        System.out.println(System.getProperties());

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();

        reader.close();*/
    }
}
