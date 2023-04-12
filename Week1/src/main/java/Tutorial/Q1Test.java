/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public class Q1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1Telephone telbook[] = new Q1Telephone[5];
        /*telbook[0] = new Q1Telephone("03","79676300");
        telbook[1] = new Q1Telephone("03","79676301");
        telbook[2] = new Q1Telephone("03","79676302");
        telbook[3] = new Q1Telephone("03","79676303");
        telbook[4] = new Q1Telephone("03","79676304");*/
        
        for (int j=0;j<5;j++){
            String first = "03";
            String second = "7967630" + String.valueOf(j);
            telbook[j] = new Q1Telephone(first,second);
        }
        
        for (int i=0;i<5;i++){
            System.out.println(telbook[i].makeFullNumber());
        }
    }
    
}
