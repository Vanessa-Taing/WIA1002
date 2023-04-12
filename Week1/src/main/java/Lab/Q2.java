/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;
import java.util.*;
import java.io.*;
/**
 *
 * @author user
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        method("text1.txt",",");
        method("text2.txt",",");
        method("text3.txt",";");
        method2("text4.txt");
    }
    
    public static void method(String filename,String replace) throws FileNotFoundException{
        String file = "C:\\Users\\user\\Documents\\WIA1002\\"+filename;
        String line;
        Scanner sc = new Scanner(new FileInputStream(file));
        String modified = "";
        while (sc.hasNext()){
            line = sc.nextLine().replaceAll(replace,"").replaceAll(" ","");
            
            System.out.print(line);
            modified = modified + line;
        }
        sc.close();
        System.out.println("\nNumber of characters: "+modified.length());
        
        System.out.println("____________________________________________");
    }
    
    public static void method2(String filename) throws FileNotFoundException{
        String file = "C:\\Users\\user\\Documents\\WIA1002\\"+filename;
        String line;
        Scanner sc = new Scanner(new FileInputStream(file));
        String modified = "";
        while (sc.hasNext()){
            line = sc.nextLine().replaceAll("\\d+","");
            System.out.print(line);
            modified = modified + line;
        }
        sc.close();
        System.out.println("\nNumber of characters: "+modified.length());
        
        System.out.println("____________________________________________");
    }
}
