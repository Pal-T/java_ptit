/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class ghepma {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<String> list1 = (ArrayList<String>) in.readObject();
        Set<String> set1 = new TreeSet<String>();
        set1.addAll(list1);
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) in.readObject();
        Set<Integer> set2 = new TreeSet<Integer>();
        set2.addAll(list2);
        for (String i : set1) {
            for (Integer j : set2) {
                System.out.println(i + j);
            }
        }
        in.close();
    }
}
