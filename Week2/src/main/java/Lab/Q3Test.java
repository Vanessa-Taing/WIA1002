/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q3Test {

    public static void main(String[] args) {
        Q3StorePairGeneric<Integer> a = new Q3StorePairGeneric<>(6,4);
        Q3StorePairGeneric<Integer> b = new Q3StorePairGeneric<>(2,2);
        Q3StorePairGeneric<Integer> c = new Q3StorePairGeneric<>(6,3);
        System.out.println("a compareTo b: "+a.compareTo(b));
        System.out.println("a compareTo c: "+a.compareTo(c));
        System.out.println("a equals b: "+a.equals(b));
        System.out.println("a equals c: "+a.equals(c));
    }
    
}
