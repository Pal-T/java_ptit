/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package javaptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = 1;
        t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();

        while (t-->0) {
            String s1 = sc.nextLine(), s2 = sc.nextLine(), s3 = sc.nextLine(), s4 = sc.nextLine();
            list.add(new SinhVien(s1, s2, s3, s4));
        }
        Collections.sort(list);
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}





