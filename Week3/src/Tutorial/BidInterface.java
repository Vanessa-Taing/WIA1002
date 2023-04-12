/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public interface BidInterface {
    /**
     * Returns the name of the company making this bid.
     * @return the name of the company making this bid.
     */
    public String returnName();
    
    /**
     * Returns the description of the air conditioner that this bid is for.
     * @return the description of the air conditioner that this bid is for.
     */
    public String returnDescription();
    
    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * @return the capacity of this bid's AC in tons.
     */
    public int returnCapacity();
    
    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * @return the seasonal efficiency of this bid's AC (SEER).
     */
    public double returnSEER();
    
    /**
     * Returns the cost of this bid's AC.
     * @return the cost of this bid's AC.
     */
    public double returnCost();
    
    /**
     * Returns the cost of installing this bid's AC.
     * @return the cost of installing this bid's AC.
     */
    public double returnInstallCost();
    
    /**
     * Returns the yearly cost of operating this bid's AC.
     * @return the yearly cost of operating this bid's AC.
     */
    public double returnYOCost();
}
