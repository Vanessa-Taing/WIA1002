/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q5FindMax {
    public static void main(String[] args){
        Integer[] intArray = {1,2,3};
        String[] strArray = {"red","green","blue"};
        Circle[] circleObj = new Circle[3];
        circleObj[0] = new Circle(3);
        circleObj[1] = new Circle(2.9);
        circleObj[2] = new Circle(5.9);
        System.out.println(max(intArray));
        System.out.println(max(strArray));
        System.out.println(max(circleObj));
    }
    
    //Creating a circle class implementing Comparable interface
    public static class Circle implements Comparable<Circle>{
        //Declare radius variable
        private double radius;
        //Contructor with single parameter
        public Circle(double r){
            this.radius = r;
        }
       
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle o) {
            if (this.radius> o.radius)
                return 1;
            else if (this.radius<o.radius)
                return -1;
            return 0;
        }
        //change type to Double (instead of double) and use Double function -> this.radius.compareTo(o.radius);

        @Override
        public String toString() {
            return "Radius=" + this.radius;
        }
        
    }
    
    //A generic method to do comparison
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        if (list[1].compareTo(list[0])>0)
            max = list[1];
        if (list[2].compareTo(list[1])>0)
            max = list[2];
        return max;
    }
}
