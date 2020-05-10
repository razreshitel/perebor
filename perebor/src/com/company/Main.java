package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Main {
    static class secondth extends Thread{
        @Override
        public void run(){
            brutforce bru = new brutforce(2);
            try {
                bru.brut();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }
    static class thirdth extends Thread{
        @Override
        public void run(){
            brutforce bruh = new brutforce(3);
            try {
                bruh.brut();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        brutforce br = new brutforce(1);
        secondth th = new secondth();
        th.start();
        thirdth thr = new thirdth();
        thr.start();
        br.brut();

    }
}
