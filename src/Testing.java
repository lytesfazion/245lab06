public class Testing {

    public static void main(String[] args){

        SortedArrayList function = new SortedArrayList();
        //create Comparable and then pass it thru function.add, BUT HOW?


        function.add(10);
        function.add(1);
        function.add(12);

        function.add(11);
        function.add(2);
        function.add(3);

        function.add(4);
        function.add(5);
        function.add(6);


        SortedLinkedList linkedFunction = new SortedLinkedList();

        linkedFunction.add(1);
        linkedFunction.add(2);
        linkedFunction.add(3);

        linkedFunction.add(4);
        linkedFunction.add(5);
        linkedFunction.add(8);

        System.out.println(linkedFunction.toString());

    }


}
