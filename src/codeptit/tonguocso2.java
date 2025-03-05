/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Arrays;
import java.util.Scanner;

public class tonguocso2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int[] M=new int[b+1];
        Arrays.fill(M,0);
        for(int i=1;i<=b;i++){
            for(int j=2*i;j<=b;j+=i)
                M[j]+=i;
        }
        int cnt=0;
        for(int i=a;i<=b;i++)
            if(M[i]>i)cnt++;
        System.out.println(cnt);
    }
}
