/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class boisochunguocsochung {
    public static Long gcd(Long a, Long b) {
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = gcd(a, b);
            System.out.println(a * b / c + " " + c);
        }
    }
}
