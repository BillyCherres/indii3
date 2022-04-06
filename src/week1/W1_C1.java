package week1;

import abstract_class.funcMaster;

import java.util.ArrayList;

public class W1_C1 extends funcMaster {

    public W1_C1(String selection) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return selection;
    }

    @Override
    public void run() {
        //sentence to be added to queue
        ArrayList<String> sentence = new ArrayList<String>();

        for(String word : "Seven slimy snakes sallying slowly slithered southward".split(" ")) {
            sentence.add(word);
        }

        //create queue
        queue<String> myQueue = new queue();

        //enqueue data
        for(String word : sentence) {
            //display word to be queued
            System.out.println("Enqueued Data: " + word);
            //add word to queue
            myQueue.push(word);

            //count queue values
            System.out.print("Words Counted: " + myQueue.length() + " ");

            //print queue as string
            System.out.println(myQueue.display().
                    toString().replaceAll("\\[|\\]", "")
                    .replaceAll(" "," ")
                    .replaceAll(",", " "));
        }

        //dequeue data
        int repeat = myQueue.length();
        for(int i = 0; i <= repeat; i++) {
            //peek queue (display first value)
            System.out.println("Dequeued Data: " + myQueue.peek());
            //pop queue (remove first value)
            myQueue.pop();

            //count queue values
            System.out.println("Words Counted: " + myQueue.length() + " ");

            //print queue as string
            System.out.print("Data: ");
            System.out.print(myQueue.display().
                    toString().replaceAll("\\[|\\]", "")
                    .replaceAll(" "," ")
                    .replaceAll(",", " "));

            if(myQueue.peek() == null) {
                System.out.println("null");
            }
        }
    }
}
