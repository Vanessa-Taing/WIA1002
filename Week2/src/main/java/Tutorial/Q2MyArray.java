/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public class Q2MyArray<T> {
    public static void main(String[] args){
        Integer[] numbers = {1,2,3,4,5};
        String[] names = {"Jane","Tom","Bob"};
        Character[] alphabet = {'a','b','c'};
        listAll(numbers);
        listAll(names);
        listAll(alphabet);
    }
    
    public Q2MyArray(){
        
    }
    public static <T> void listAll(T[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println(" ");
    }
}
