package com.dj.thread;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//        System.out.println(4<<2);
//        System.out.println(32>>4);
//        Integer a = 128;
//        Integer b = 128;
//        System.out.println(a == b);
//        new LinkedList<>();
//        new HashSet<>(32);
//        new ArrayList<>(16);
//        int a = 2;
//        a = aa(a);
//        System.out.println(a);
        User user = new User();
        user.setName("zs");
        System.out.println(user);
        bb(user);
        System.out.println(user.getName());
    }

    public static int aa(int a){
        return a += 1;
//        System.out.println(a);
    }

    public static void bb(User user){
        System.out.println(user);
        user.setName("ls");
    }

}
