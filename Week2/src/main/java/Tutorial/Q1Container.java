/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public class Q1Container<T> {
    private T t;
    //empty contructor
    public Q1Container() {
    }
    //constructor
    public Q1Container(T x) {
        this.t = x;
    }
    public void add(T a){
        this.t = a;
    }
    public static <T> String retrieve(T b){
        System.out.println(b);
        return "";
    }
    
    //public T retrieve(){return t;}
    
    
    public static void main(String[] args){
        Q1Container<Integer> container1 = new Q1Container<>();
        Q1Container<String> container2 = new Q1Container<>();
        
        Q1Container.<Integer>retrieve(50);
        Q1Container.<String>retrieve("Java");
        
    }
}
