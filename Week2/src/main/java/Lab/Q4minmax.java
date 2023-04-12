/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q4minmax{

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red","blue","orange","tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
        
    }
    public static <T extends Comparable<T>> String minmax(T[] arr){
        T min = arr[0];
        T max = arr[0];
        
        for (int i = 1;i<arr.length;i++){
            if (arr[i].compareTo(min)<0)
                min = arr[i];
            if (arr[i].compareTo(max)>0)
                max = arr[i];
        }
        return "Min = "+min+"\nMax = "+max;
    }
  
}

