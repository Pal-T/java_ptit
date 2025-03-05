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
public class tongiaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long s = (long) 1, k = (long) 1;
        for (int i = 2; i <= n; i++) {
            k *= i;
            s += k;
        }
        System.out.print(s);
    }
}
