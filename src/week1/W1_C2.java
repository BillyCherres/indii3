package week1;

import abstract_class.funcMaster;

import java.util.Arrays;
import java.util.List;

public class W1_C2 extends funcMaster {

    public W1_C2(String selection) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    @Override
    public void run() {
        //queue list numbers
        List<Integer> q1_list = Arrays.asList(1, 4, 5, 8);
        List<Integer> q2_list = Arrays.asList(2, 3, 6, 7);

        //initialize queues
        queue<Integer> q1 = new queue();
        queue<Integer> q2 = new queue();

        //initialize output queue
        queue<Integer> output = new queue();

        //insert list into q1
        for(int num : q1_list) {
            q1.push(num);
        }

        for(int num : q2_list) {
            q2.push(num);
        }

        System.out.println("List 1: " + q1.display());
        System.out.println("List 2: " + q2.display());

        //loop until both lists are empty
        while((q1.display() != null) || (q2.display() != null)) {
            try {
                //checks whether q1's output or q2's output is smaller
                if((q1.peek() < q2.peek()))  {
                    output.push(q1.peek());
                    q1.pop();
                }
                else if((q2.peek() < q1.peek()) || ((q1.peek()) == null) || (q2.peek() == null)) {
                    output.push(q2.peek());
                    q2.pop();
                }
                //when a list is null, move to this section
                //appends any remaining values
            } catch (Exception e) {
                if(q1.peek() == null) {
                    output.push(q2.peek());
                    q2.pop();
                    break;
                }
                else if(q2.peek() == null) {
                    output.push(q1.peek());
                    q1.pop();
                    break;
                }
            }
        }

        System.out.println("Output: " + output.display());

    }
}
