/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q2CompareMax {

    public static void main(String[] args) {
        Integer a =1;
        Integer b =4;
        Integer c =2;
        System.out.println(Maximum(a,b,c));
    }
    
    public static <T extends Comparable<T>> T Maximum(T a,T b,T c){
        T max =a;
        if (b.compareTo(a)>0)
            max =b;
        if (c.compareTo(b)>0)
            max =c;
        return max;
    }
}

