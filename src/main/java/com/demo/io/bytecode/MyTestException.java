package com.demo.io.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class MyTestException {
    public void test(){
        try {
            InputStream in = new FileInputStream("text.txt");
            ServerSocket s = new ServerSocket(9999);
            s.accept();
        }catch (FileNotFoundException e){

        }catch (IOException e){

        }catch (Exception e){

        }finally {
            System.out.println("finally.");
        }
    }
}
