/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;


import java.util.Scanner;
import java.util.Stack;

public class gobanphim{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        Stack<Character> M=new Stack<>();
        Stack<Character> N=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='<'){
                if(M.size()!=0){
                    N.push(M.peek());
                    M.pop();
                }
            }
            else if(s.charAt(i)=='>'){
                if(N.size()!=0){
                    M.push(N.peek());
                    N.pop();
                }
            }
            else if(s.charAt(i)=='-'){
                if(M.size()!=0)M.pop();
            }
            else M.push(s.charAt(i));
        }
        while(M.size()!=0){
            N.push(M.peek());
            M.pop();
        }
        while(N.size()!=0){
            System.out.print(N.peek());
            N.pop();
        }
    }
}