public class DynamicArray {

    private int capacity = 10; 
    private int size; 

    private Object[] array; 

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity]; 
    }

    public void add(Object data){
        if (size >= capacity){
            grow();
        }

        array[size] = data; 
        size++;
    }

    public void insert(Object data, int index){
          if (size >= capacity){
            grow();
        }


        for (int i = size; i > index; i --){
            array[i] = array[i-1]; // array[i] is equal to the left most element esentailly shift right
        }

        array[index] = data;
        size++;

    }

    public void delete(Object data){

        int index = 0; 

        while (array[index] != data){ //to reach the data point we want to delete
            index++; 
        }

        if (index == size) {
            throw new IllegalArgumentException("Element not found in the array");
        }

        while(array[index] !=  null){
            array[index] = array[index+1]; 
            index++;
        }
        size--; 

        if (size <= (int) capacity/3){
            shrink();
        }
    }

    public int search(Object data){
        for (int i = 0; i < size; i ++){
            if (array[i] == data){
                return i;
            }
        }

        return -1; 
    }

    private void grow(){
        int newCapacity = capacity * 2; 
        Object[] newArray = new Object[newCapacity]; 

        for (int i = 0; i < size; i ++){
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;

    }

    private void shrink(){
        int newCapacity = capacity / 2; 
        Object[] newArray = new Object[newCapacity]; 

        for (int i = 0; i < size; i ++){
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty(){
        return size == 0; 
    }

    public String toString(){
        String string = "";

        for (int i = 0; i < capacity; i ++){
            string += array[i] + ", ";
        }

        if (string != ""){
            string = "["+ string.substring(0, string.length() -2) + "]";
        }

        else{
            string = "[]";
        }



        return string;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getSize(){
        return this.size; 
    }

   



    
}
