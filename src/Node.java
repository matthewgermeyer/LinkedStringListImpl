//
public class Node {


    //What's IN the NODE.. the value.
    private String value;
    //WHERE THE NODE POINTS i.e. the reference to the subsequent node. a link to next node
    private Node next;

    public Node(String value) {
        this.value = value;
    }

    //GetSet
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    //toString
    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
