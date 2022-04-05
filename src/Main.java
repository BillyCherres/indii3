//imports
import java.util.*;

import src.week0.matrix;
import src.week0.swapper;

public class Main {

    public static void main(String[] args) {
        //Initialize scanner (user input)
        Scanner input = new Scanner(System.in);

        //Create swapper class
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(-1);
        swapper mySwapper = new swapper("Week 0: Swapper", nums);

        //Create matrix class
        matrix myMatrix = new matrix("Week 0: Matrix");

        //Create menu options dictionary
        Dictionary<Integer, funcMaster> myElements = new Hashtable<Integer, funcMaster>(); {
            myElements.put(0, mySwapper);
            myElements.put(1, myMatrix);
            // myElements.put(2, myWeek2);
            // myElements.put(3, myWeek3);
        }
        
        //Create menu class object
        menu myMenu = new menu(myElements);

        Boolean running = true;
        while(running == true){
            //Print insturctions
            System.out.println("Enter Item Number From Following List: ");
            myMenu.print();

            //Read user input
            int choice = input.nextInt();

            //Try choice
            try {
                //Run selection
                myMenu.run(choice);
            }
            //Return valid values
            catch(Exception e) {
                System.out.println("Enter a valid number");
            }
        }
    }
}