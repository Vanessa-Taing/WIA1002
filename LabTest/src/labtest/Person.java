package labtest;

/**
 * @author VJT
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("%s (age=%s)", this.name, this.age);
    }

}

class Node<E> {

    private E value;
    private String edgeName1;
    private String edgeName2;
    private Node<E> edgeNode1;
    private Node<E> edgeNode2;

    public Node(E value) {
        this.value = value;
    }

    public void setEdge1(String edgeName, Node<E> node) {
        this.edgeNode1 = node;
        this.edgeName1 = edgeName;
    }

    public void setEdge2(String edgeName, Node<E> node) {
        this.edgeNode2 = node;
        this.edgeName2 = edgeName;
    }

    public E getValue() {
        return this.value;
    }

    public void printEdgesAndNodes() {
        System.out.println("-------------------------------------");
        System.out.println(this.value);
        System.out.println("\t:" + this.edgeName1 + "->");
        System.out.println("\t\t" + this.edgeNode1.value);
        System.out.println("\t:" + this.edgeName2 + "->");
        System.out.println("\t\t" + this.edgeNode2.value);
        System.out.println("-------------------------------------");
    }

    public Node<E> traverse(String edgeName) {
        if (edgeName.equals(this.edgeName1)) {
            return this.edgeNode1;
        } else if (edgeName.equals(this.edgeName2)) {
            return this.edgeNode2;
        } else {
            throw new IllegalArgumentException("Invalid edge name");
        }
    }

}
