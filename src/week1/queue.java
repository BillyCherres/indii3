package week1;

import java.util.ArrayList;

public class queue<T> {

    private ArrayList<T> list = new ArrayList<T>();

    public queue() {}

  //add data to queue
    public void push(T data){
        list.add(data);
    }

    //remove from queue (pop)
    public void pop(){
        //if list is not empty
        if(!list.isEmpty()){
            //remove item from list
            list.remove(0);
        }
        else{
            System.out.println("null");
        }
    }

    //view top of queue (peek)
    public T peek(){
        if(!list.isEmpty()){
            return list.get(0);
        }
        else{
            return null;
        }
    }

    //view entire queue
    public ArrayList<T> display(){
        return list;
    }

    //view length of queue
    public int length(){
        return list.size();
    }

    //clear queue
    public void clear(){
        list.clear();
    }
}
