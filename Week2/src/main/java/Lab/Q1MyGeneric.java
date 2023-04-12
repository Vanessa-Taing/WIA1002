/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author VJT
 */
public class Q1MyGeneric <T>{
    T e;

    public Q1MyGeneric() {
    }
    
    public Q1MyGeneric(T e){
    
    }

    public T getE() {
        System.out.println(e);
        return e;
        
    }

    public void setE(T e) {
        this.e = e;
    }
    
    
}
