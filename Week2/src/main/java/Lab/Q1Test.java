/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q1Test {

    public static void main(String[] args){
        Q1MyGeneric<String> strObj = new Q1MyGeneric<>();
        Q1MyGeneric<Integer> intObj = new Q1MyGeneric<>();
        strObj.setE("hi");
        intObj.setE(1);
        strObj.getE();
        intObj.getE();
    }
    
}
