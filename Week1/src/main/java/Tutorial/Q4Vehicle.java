/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public abstract class Q4Vehicle {
    double maxSpeed;
    protected double currentSpeed;

    public Q4Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void accelerate();

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

}
