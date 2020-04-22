public class SingleDimentionArray{
    int arr[] = null;

    //constructor
    public SingleDimentionArray(int size){
        arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //traverse
    public void traverseArray(){
        try{
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    //insert value in array
    public void insert(int location, int value){
        try{
            if(arr[location-1] == Integer.MIN_VALUE){
                arr[location-1] = value;
                System.out.println("The value: " + value + " inserted in position: " + location);
            }
            else{
                System.out.println("This cell is already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to be access array");
        }
    }

    //search
    public void search(int value){
        for(int i=0; i<value; i++){
            if(arr[i] == value){
                System.out.println("Value " + value + " found at index " + i);
                return;
            }
        }
        System.out.println("Element " + value + " not found");
    }

    //delete
    public void delete(int location){
        try{
            arr[location-1] = Integer.MIN_VALUE;
        }
        catch (Exception e){
            System.out.println(location + " is not a valid location for deletion");
        }
    }
}