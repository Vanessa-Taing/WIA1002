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
public class Q1Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String filepath = "C:\\Users\\user\\Documents\\WIA1002\\VanessaJingTaing_22004847.txt";
        Scanner sc = new Scanner(new FileInputStream(filepath));
        
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
        String line;
        BufferedReader b = new BufferedReader(new FileReader(filepath));
        while ((line = b.readLine())!=null){
            System.out.println(line);
        }
        b.close();
    }  
    
}
