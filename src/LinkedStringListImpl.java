// LinkedStringListImpl implements the StringList interface
// it MUST be declared abstract OR implement the following methods:
//              String replace();    DO THIS LATER!!
//              String remove();     1

public class LinkedStringListImpl implements StringList {
    private Node head;

    //Methods
    //Add a node
    @Override
    public void add(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            //temp points to the end of the list
            Node newNode = new Node(value);
            temp.setNext(newNode);
        }
    }

    //Remove a node.
    @Override
    public void remove(int index) {


    }

    //get the Size of the list
    @Override
    public int size() {
        int count = 0;
        if (head == null) {
            System.out.println(count);
        } else {
            Node temp = head;
            count = 1;
            while (temp.getNext() != null) {
                ++count;
                temp = temp.getNext();
            }
            System.out.println("The size of the list is " + count + "\n");
        }
        return 0;
    }

    //Get value from index parameter
    @Override
    public String get(int index) {
        if (head == null) {
            System.out.println("list is empty!");
            return null;

        } else {
            int count = 0;
            Node temp = head;
            if (index == 0) {
                return temp.getValue();
            }

            while (temp.getNext() != null) {
                temp = temp.getNext();
                ++count;
                if ((count == index)) {
                   // System.out.println("the value at " + index + " is " + temp.getValue());
                    return temp.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "LinkedStringListImpl{" +
                "head=" + head +
                '}';
    }
}
