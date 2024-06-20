package Oops;

public class DynamicArray {

    private int[] data ;
    private int nextElementIndex;
    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }
    public int size (){
        return nextElementIndex;
    }
    public int getElement(int i){
        if(i>= nextElementIndex){
            return 0;
        }
        return data[i];
    }
    public boolean isEmpty(){
        return nextElementIndex==0;
    }
    public void add (int element){

        if(nextElementIndex == data.length){
            doubleCapacity();
        }
        data[nextElementIndex] = element;
        nextElementIndex++;
    }
    public void setElement(int index , int element){
        if(index>= nextElementIndex){
            return;
        }
        data[index] = element;
    }
    public void removeLast(){
        int temp = data[nextElementIndex-1];
        data[nextElementIndex - 1] = 0 ;
        nextElementIndex--;
    }

    private void doubleCapacity(){
        int[] temp = data;
        data = new int[2*temp.length];
        for(int i = 0 ; i <temp.length ; i++){
            data[i] = temp[i];
        }
    }
}
