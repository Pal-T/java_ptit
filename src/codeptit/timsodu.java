/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class timsodu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int r = 0;
//            for(int i = 0; i < s.length(); i++){
//                r = (r*10 + s.charAt(i) - '0') % 4;
//            }
//            if(r == 0){
//                System.out.println(4);
//            }
//            else {
//                System.out.println(0);
//            }
            if(s.length() >= 2)
                r = 10 * (s.charAt(s.length() - 2) - '0') + (s.charAt(s.length() - 1) - '0');
            else
                r = s.charAt(0) - '0';
            if(r % 4 == 0)
                System.out.println(4);
            else
                System.out.println(0);
        }
    }
}