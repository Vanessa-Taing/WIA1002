/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public class Q1Telephone {
    private String areaCode;
    private String number;
    protected static int numberOfTelephoneObject =0;
    
    public Q1Telephone(String a, String b){
        this.areaCode = a;
        this.number = b;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void setNumberOfTelephoneObject(int numberOfTelephoneObject) {
        Q1Telephone.numberOfTelephoneObject = numberOfTelephoneObject;
    }
    
    
    
    public String makeFullNumber(){
        return this.areaCode + "-" +this.number;
    }
}
