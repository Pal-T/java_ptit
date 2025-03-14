/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class tinhgiatribieuthuc {
    public static String op = "+-*/";

    static Boolean check(char k) {
        for (int i = 0; i < op.length(); i++) {
            if (k == op.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static int deg(char k) {
        if (k == '*' || k == '/') {
            return 1;
        } else if (k == '+' || k == '-') {
            return 2;
        } else {
            return 3;
        }
    }

    static String toPost(String a) {
        String res = "";
        Stack<Character> st = new Stack<Character>();
        st.push('#');
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                st.push(a.charAt(i));
                continue;
            } else if (a.charAt(i) == ')') {
                while (st.size() > 0 && st.peek() != '(') {
                    res += st.peek();
                    st.pop();
                }
                st.pop();
                continue;
            } else if (check(a.charAt(i))) {
                while (st.size() > 0 && deg(st.peek()) <= deg(a.charAt(i))) {
                    res += st.peek();
                    st.pop();
                }
                st.push(a.charAt(i));
                continue;
            }
            Long so = 0L, ok = 0L;
            while (i < a.length() && a.charAt(i) != ')' && !check(a.charAt(i))) {
                Long ss = (long) (a.charAt(i) - '0');
                i++;
                so = so * 10 + ss;
                ok = 1L;
            }
            if (ok == 1)
                i--;
            res += "(";
            res += Long.toString(so);
            res += ")";
        }
        while (st.size() > 0 && st.peek() != '#') {
            res += st.peek();
            st.pop();
        }
        return res;
    }

    static Long tinh(String a) {
        Stack<Long> st = new Stack<Long>();
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) == '(') {
                i++;
                Long so = 0L;
                while (a.charAt(i) != ')') {
                    so = so * 10 + (a.charAt(i) - '0');
                    i++;
                }
                i++;
                st.push(so);
            } else if (st.size() > 1) {
                Long tmp1 = st.peek();
                st.pop();
                Long tmp2 = st.peek();
                st.pop();
                if (a.charAt(i) == '+')
                    st.push(tmp1 + tmp2);
                else if (a.charAt(i) == '-')
                    st.push(tmp2 - tmp1);
                else if (a.charAt(i) == '*')
                    st.push(tmp1 * tmp2);
                else if (a.charAt(i) == '/')
                    st.push(tmp2 / tmp1);
                i++;
            }
        }
        return st.peek();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(tinh(toPost(s)));
        }
        sc.close();
    }
}
