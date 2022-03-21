# Code Snippets
# Table of Contents
- [Menu Code](https://github.com/BillyCherres/squirty_grinnellians/blob/gh-pages/Challenge_Code.md#menu-code)
- [Swapper Code](https://github.com/BillyCherres/squirty_grinnellians/blob/gh-pages/Challenge_Code.md#swapper-code)
- [Matrix Code](https://github.com/BillyCherres/squirty_grinnellians/blob/gh-pages/Challenge_Code.md#matrix)

# Linked list and Java Generic T
- [replit](https://billycherres.github.io/indii3/replit.html)

```
public static void main(String[] args) {

    //linked list creation for challenge sentence
    LinkedList<String> = sentence = new LinkedList<String>();

```

```
//generic T allows any data type to be used when class is called
public class queue<T> {

    private ArrayList<T> list = new ArrayList<T>();

    public queue() {}

    public void push(T data){
        list.add(data);
    }
```

# Queue Add and Delete
- [replit](https://billycherres.github.io/indii3/replit.html)
```
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
            return null;
        }
    }
```

# Merge 2 Queues 
- [replit](https://billycherres.github.io/indii3/replit.html)
```
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

```

# Build Stack and reverse Queue Order
- [replit](https://billycherres.github.io/indii3/replit.html)

```
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
```


# Menu Code

```
import java.util.Dictionary;
import java.util.Scanner;

public class menu {

    //Initialize variables
    private Dictionary<Integer, funcMaster> elements;
    Scanner input = new Scanner(System.in);

    //Constructor
    public menu(Dictionary<Integer, funcMaster> elements) {
        //Takes dictionary as input
        this.elements = elements;
    }

    //Iterate over dictionary and print all values
    public void print() {
        for(int i = 1; i <= this.elements.size(); i++) {
            System.out.print(i + " ");
            System.out.println(elements.get(i).getSelection());
        }
    }

    public void run(int x) {
        this.elements.get(x).run();
    }
}
```

# Swapper Code
```
public class swapper extends funcMaster {
    public swapper(String selection, ArrayList<Integer> nums) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        //First user number
        System.out.print("Number 1: ");
        int num1 = input.nextInt();

        //Second user number
        System.out.print("Number 2: ");
        int num2 = input.nextInt();

        nums.add(num1);
        nums.add(num2);

        //Before statement
        System.out.println("Before: " + nums.get(0) + " " + nums.get(1));

        //Switcher
        if(nums.get(0) > nums.get(1)) {
            Integer temp = nums.get(1);
            nums.set(1, nums.get(0));
            nums.set(0, temp);
        }

        //After statement
        System.out.println("After: " + nums.get(0) + " " + nums.get(1));

    }
}
```

# Matrix
```
public class matrix extends funcMaster{
    public matrix(String selection) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    public String switchMatrix1(int[][] matrix, int rows, int columns) {
        int[][] newMatrix = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                newMatrix[i][columns - j - 1] = matrix[i][j];
                System.out.println(matrix[i][j]);
            }
        }
        String output = newMatrix.toString();
        return output;
    }

    public static int[][] switchMatrix(int[][] matrix, int rows, int columns) {
        int[][] output = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                output[rows - i - 1][columns - j - 1] = matrix[i][j];
            }
        }
        return output;
    }

    public static void printMatrix(int matrix[][]) {
        for(int i = 0; i <matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public void run() {
        int[][] matrix1 = new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };

        int[][] matrix2 = new int[][]{ { 0, 1 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };

        System.out.println("Matrix 1: ");
        printMatrix(matrix1);

        System.out.println();

        System.out.println("Matrix 1 Flipped: ");
        printMatrix(switchMatrix(matrix1, matrix1.length, matrix1[0].length));
        System.out.println();

        System.out.println("Matrix 2: ");
        printMatrix(matrix2);
    }
}
```
