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
public class uocsntlennhat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long ans = 0L;
            for (Long i = 2L; i * i <= n; i++) {
                if (n % i == 0) {
                    ans = i;
                    while (n % i == 0)
                        n /= i;
                }
            }
            if (n > 1)
                ans = n;
            System.out.println(ans);
        }
    }
}
