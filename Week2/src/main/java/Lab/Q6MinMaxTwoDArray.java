package Lab;

/**
 *
 * @author VJT
 */
public class Q6MinMaxTwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[][] array = {{4,5,6},{1,2,3}};
        System.out.println(min(array));
        System.out.println(max(array));
    }
    
    public static <E extends Comparable<E>> E min (E[][] list){
        E min = list[0][0];
        for (E[] row:list)
            for(E element:row)
                if (element.compareTo(min)<0)
                    min = element;
        return min;
                   
    }
    public static <E extends Comparable<E>> E max (E[][] list){
        E max = list[0][0];
        for (E[] row:list)
            for(E element:row)
                if (element.compareTo(max)>0)
                    max = element;
        return max;
                   
    }
}
