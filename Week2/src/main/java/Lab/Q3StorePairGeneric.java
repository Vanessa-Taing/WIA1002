/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q3StorePairGeneric <T extends Comparable<T>> implements Comparable<Q3StorePairGeneric<T>>{
    private T first, second;
    public Q3StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object obj1){
        if (this == obj1)
            return true;
        if (!(obj1 instanceof Q3StorePairGeneric)) return false;
        return this.first.equals(((Q3StorePairGeneric<T>) obj1).getFirst());
    }
    
    @Override
    public int compareTo(Q3StorePairGeneric<T> o) {
        return this.first.compareTo(o.getFirst());
        
    }
    
}

