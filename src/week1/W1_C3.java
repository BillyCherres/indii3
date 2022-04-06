package week1;

import abstract_class.funcMaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W1_C3 extends funcMaster {

    public W1_C3(String selection) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    @Override
    public void run() {
        //initialize queues
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        queue<Integer> start = new queue();

        for(int num : list) {
            start.push(num);
        }

        //create stack
        stack<Integer> output = new stack();

        //move queue elements into stack
        int j = start.length();
        for(int i = 0; i < j; i++) {
            output.push(start.peek());
            start.pop();
        }

        //put stack into a list
        //putting a queue into a stack reverses order
        //first in first out to first in last out
        ArrayList<Integer> output_list = new ArrayList<Integer>();

        int k = output.length();
        for(int i = 0; i < k; i++) {
            output_list.add(output.peek());
            output.pop();
        }

        //display output
        System.out.print("Before: ");

        System.out.println(list
                .toString()
                .replaceAll("\\[|\\]", "")
                .replaceAll(" "," ")
                .replaceAll(",", " "));

        System.out.print("After: ");
        System.out.println(output_list
                .toString()
                .replaceAll("\\[|\\]", "")
                .replaceAll(" "," ")
                .replaceAll(",", " "));
    }
}


