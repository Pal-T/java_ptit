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
public class catdoi {
     public static Long Try(String s) {
        Long ans = 0L;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
                ans = ans * 10 + 1;
            else if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9')
                ans = ans * 10;
            else
                return -1L;
        }
        return ans;
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long ans = Try(Long.toString(n));
            if (ans == -1L || ans == 0)
                System.out.println("INVALID");
            else
                System.out.println(ans);
        }
    }
}
