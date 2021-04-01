import java.util.Arrays;

public class SortedArrayList<T extends Comparable<T>> implements SortedList <T>{
    //This implementation is similar to the ArrayList implementation of the List,
    // with the exception that the add function maintains the contained items in sorted order.

    protected Comparable[] arrList;
    protected int size;



    public SortedArrayList(){

        arrList = new Comparable[10];

        size = 0;
    }

    @Override
    public boolean add(Comparable item) {

        //Comparing the item to an element in the Object List so it can be placed in the correct place

        //if empty, add to list
        if (size == 0){
            arrList[0] = item;
            size++;
            System.out.println(Arrays.toString(arrList));
            return true;
        }
        //if full, grow array
        if (size == arrList.length){

            T[] new_array = (T[]) new Comparable[arrList.length*2];

            //copy into new array
            for(int i = 0; i < arrList.length; i++){
                new_array[i]= (T) arrList[i];
            }
            //reassign
            arrList = new_array;
        }

        int counter = size-1;

        //insertion sort logic

        while ( counter >= 0 && arrList[counter].compareTo(item) > 0){

            arrList[counter+1] = arrList[counter];
            counter--;

        }

        arrList[counter+1] = item;
        size++;
        System.out.println(Arrays.toString(arrList));
        return false;
    }

    @Override
    public T remove(int pos) throws Exception{

        // The function takes in an integer position, which then both removes and returns the item of type T at that position.

        //if pos is not invalid
        if (pos < 0 || pos > size){
            throw new Exception("Invalid Position");
        }
        //copy the item we are removing
        T copyofRemovedItem = (T) arrList[pos];

        //Shift all items over
        for(int i = pos; i< size-1; i++){
            arrList[i] = arrList[i+1];
        }
        size--;

        return copyofRemovedItem;
    }

    @Override
    public T get(int pos)throws Exception {

        if (pos < 0 || pos >= size){
            throw new Exception("Invalid Position");// The position is invalid.
        }
        return (T) arrList[pos];
    }

    @Override
    public int size() {

        return size();
    }

}

