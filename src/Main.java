//imports
import abstract_class.funcMaster;
import week0.matrix;
import week0.swapper;
import week1.W1_C1;
import week1.W1_C2;
import week1.W1_C3;
import week2.W2_C1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (//Initialize scanner (user input)
        Scanner input = new Scanner(System.in)) {
            //Create menu options dictionary
            Dictionary<Integer, funcMaster> myElements = new Hashtable<Integer, funcMaster>(); {
                myElements.put(1, new exit("Exit"));
                myElements.put(2, new swapper("Week 0: Swapper", null));
                myElements.put(3, new matrix("Week 0: Matrix"));
                myElements.put(4, new W1_C1("Week 1 Challenge 1"));
                myElements.put(5, new W1_C2("Week 1 Challenge 2"));
                myElements.put(6, new W1_C3("Week 1 Challenge 3"));
                myElements.put(7, new W2_C1("Week 2 Challenge 1"));
            }
            
            //Create menu class object
            menu myMenu = new menu(myElements);

            Boolean running = true;
            while(running == true){
                //Print insturctions
                System.out.println("Enter Item Number From Following List: ");
                myMenu.print();

                //Read user input
                System.out.println("Enter a number: ");
                int choice = input.nextInt();

                //Try choice
                try {
                    //Run selection
                    myMenu.run(choice);
                    System.out.println();
                }
                //Return valid values
                catch(Exception e) {
                    System.out.println("Enter a valid number");
                }
            }
        }
    }
}