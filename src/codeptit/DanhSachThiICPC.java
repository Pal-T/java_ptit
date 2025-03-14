/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    String ten;
    String ma;
    String ct;
    static int id = 1;

    ThiSinh(String ten, String ct) {
        this.ten = ten;
        this.ct = ct;
        this.ma = String.format("C%03d", id++);
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + ct;
    }
}

public class DanhSachThiICPC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine() + " " + sc.nextLine());
        }
        n = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> list2 = new ArrayList<ThiSinh>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String ma = sc.nextLine();
            int m = ma.length();
            int k = (ma.charAt(m - 2) - '0') * 10 + (ma.charAt(m - 1) - '0') - 1;
            list2.add(new ThiSinh(s, list.get(k)));
        }
        Collections.sort(list2);
        for (ThiSinh thiSinh : list2) {
            System.out.println(thiSinh);
        }
        sc.close();
    }
}
