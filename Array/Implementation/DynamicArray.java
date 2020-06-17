public class DynamicArray{
    int arr[];
    int length;
    int size;

    public DynamicArray(){
        arr = new int[1];
        length = 0;
        size = 1;
    }

    public void add(int ele){
        if(size == length){
            resize();
        }
        arr[length++] = ele;
    }

    public void addAt(int ele, int index){
        if(size == length){
            resize();
        }
        for(int i=length; i>index; i--){
            arr[i] = arr[i-1];
        }
        length++;
        arr[index] = ele;
    }

    public int remove(){
        return arr[length-- - 1];
    }

    public void remove(int index){
        for(int i=index; i<length-1; i++){
            arr[i] = arr[i+1];
        }
        length--;
    }

    public void resize(){
        size *= 2;
        int[] temp = new int[size];
        for(int i=0; i<size/2; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public static void main(String[] args){
        DynamicArray dArr = new DynamicArray();
        dArr.add(14);
        System.out.println("length: " + dArr.length);
        dArr.add(61);
        System.out.println("length: " + dArr.length);
        dArr.addAt(75, 1);
        System.out.println("length: " + dArr.length);
        dArr.remove(1);
        System.out.println("length: " + dArr.length);
        System.out.println(dArr.remove());
        System.out.println(dArr.remove());
        System.out.println(dArr.remove());
    }
}
