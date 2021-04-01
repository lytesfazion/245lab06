public interface SortedList<T extends Comparable <T>> {
//You will implement a SortedList so that it stores Comparable instances and maintains
// them in sorted order inside the SortedList.

    //T remove1(int pos) throws Exception;

    public boolean add(T Comparable);//Compares this object with the specified object for order.
    //Are the types correct?
    public T remove(int pos)throws Exception;
    public T get(int pos)throws Exception;
    public int size();
    //public String toString();
}
