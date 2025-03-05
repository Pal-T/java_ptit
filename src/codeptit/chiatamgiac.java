/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author ADMIN
 */
public class chiatamgiac {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble(), k = sc.nextDouble();
            for (int i = 1; i < n; i++) {
                double h = Math.sqrt(i / n) * k;
                System.out.printf("%.6f ", h);
            }
            System.out.println();
        }
    }
}
