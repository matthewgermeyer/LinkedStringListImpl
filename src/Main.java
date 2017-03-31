public class Main {

    public static void main(String[] args) {
        LinkedStringListImpl list= new LinkedStringListImpl();
        list.add("First this!");
        System.out.println(list);
        System.out.println();
        list.add("Secondly");
        System.out.println(list);
        list.add("Third");
        System.out.println(list);

        //using size.
        list.size();

        //using get.
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


       // list.remove(2);



    }
}
