package com.org.view;

import com.org.Service;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Consol implements View{


    @Override
    public void write(String message) {
        System.out.println(message);
    }

    @Override
    public String read() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
