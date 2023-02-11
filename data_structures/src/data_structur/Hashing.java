/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structur;

import java.util.Scanner;

/**
 *
 * @author ziade
 */
public class Hashing {

    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        StopWatch Timer = new StopWatch();
        Timer.setstartime(System.currentTimeMillis());
        HashTable hash = new HashTable();
        System.out.println("Enter satment");
        String str1 = s.nextLine();
        char[] ch = str1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            hash.put((int) ch[i]);
        }
        hash.getmax();
        Timer.setendtime(System.currentTimeMillis());
        double starttime = Timer.getstarttime();
        double endtime = Timer.getendtime();
        System.out.println("Excution time in mili seconed:\t" + Timer.gettimeelapsed(endtime, starttime)+" millisecond  ");
    }
}
