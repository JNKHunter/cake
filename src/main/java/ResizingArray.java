/**
 * Created by John on 6/29/17.
 */
public class ResizingArray {

    private int[] array;
    int count;

    public ResizingArray() {
        array = new int[4];
        count = 0;
    }

    public void push(int val){
        count += 1;

        if(count > array.length/2) {
            resize(array.length * 2);
        }

        array[count - 1] = val;
    }

    public int pop() {

        if(count < array.length/4) {
            resize(array.length/2);
        }

        int tmp = array[count - 1];
        array[count - 1] = 0;

        count -= 1;
        return tmp;


    }

    private void resize(int newSize) {
        int[] temp = new int[newSize];

        for(int i = 0; i < count; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }

    public static void main(String[] args) {
        ResizingArray numbers = new ResizingArray();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        numbers.push(6);

        numbers.pop();
        numbers.pop();
        numbers.pop();
        numbers.pop();
        numbers.pop();
        numbers.pop();
    }
}
