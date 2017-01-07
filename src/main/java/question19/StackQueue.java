package question19;

import java.util.Stack;

/**
 * Created by jhunter on 1/6/17.
 */
public class StackQueue{
    private Stack<Integer> leftStack;
    private Stack<Integer> rightStack;

    public StackQueue(){
        leftStack = new Stack<>();
        rightStack = new Stack<>();
    }

    public void enqueue(Integer value){
        leftStack.push(value);
    }

    public Integer dequeue(){
        if(rightStack.size() > 0){
            return rightStack.pop();
        }else{

            while(!leftStack.empty()){
                rightStack.push(leftStack.pop());
            }
            return rightStack.pop();
        }
    }

    public Integer peek(){
        if(rightStack.size() == 0) {
            shuffleToRightStack();
        }
        return rightStack.peek();
    }

    private void shuffleToRightStack(){
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
    }
}


