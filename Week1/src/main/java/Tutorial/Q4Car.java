/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;
import java.util.*;
/**
 *
 * @author user
 */
public class Q4Car extends Q4Vehicle{
    protected int count=0;
    Scanner sc = new Scanner(System.in);

    public Q4Car(double maxSpeed) {
        super(maxSpeed);
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    
    @Override
    public void accelerate() {
        this.currentSpeed=this.currentSpeed + sc.nextInt();
        //setCurrentSpeed(this.currentSpeed + sc.nextInt());
    }
    public void pedalToTheMetal(Q4Vehicle vehicle){
        while(this.currentSpeed<this.maxSpeed){
            vehicle.accelerate();
            count ++;
        }
        System.out.println("Times accelerated: "+count);
    };

}
