package week1;

//imports
import java.util.ArrayList;
import java.util.EmptyStackException;

public class stack<T> {
    private ArrayList<T> list = new ArrayList<T>();

    //constructor
    public stack(){

    }

    //add to stack (push)
    public void push(T data){
        list.add(data);
    }

    //remove from stack (pop)
    public void pop(){
        //if list is not empty
        if(!list.isEmpty()){
            //remove item from list
            list.remove(list.size()-1);
        }
        else{
            System.out.println("null");
        }
    }

    //view top of stack (peek)
    public T peek(){
        if(!list.isEmpty()){
            return list.get(list.size() -1 );
        }
        else{
            return null;
        }
    }

    //view length of stack
    public int length(){
        return list.size();
    }

    //clear stack
    public void clear(){
        list.clear();
    }

    public void display(){
        System.out.println(list);
    }

}