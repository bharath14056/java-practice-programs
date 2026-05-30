import java.util.*;
class MyArrayList {

    int[] arr;
    int size;
    int capacity;

    public MyArrayList() {
        capacity = 4;
        arr = new int[capacity];
        size = 0;
    }

    public void add(int data) {


        arr[size] = data;
        size++;
    }


	
}
class Implementationarraylist
{
    public static void main(String[] args) {
        List<Integer> bag=new <Integer>ArrayList();
		bag.add(30);
		
		System.out.println(bag);

       

        
    }
}