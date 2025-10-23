package ie.atu.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char [] x= new char[5];
        double [] dooble ={1.5, 2.5, 3.5, 4.5, 5.5};
        int [] numbers={5, 10, 15, 20};

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            System.out.println(dooble[i]);
        }
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("");
        // Length Exercise
        String [] rainbow={"Red","Yellow","Orange","Green","Blue","Violet","Indigo"};
        System.out.println(rainbow.length);
        //Array reverse initialisation;
        int[] y={1,2,3,4,5};
        for(int i:y){
            System.out.println(y[(y.length)-i]);
        }
        // Modifying arrays
        int[] nums = {10, 20, 30, 40, 69};
        nums[2]=35;
        for(int n:nums){
            System.out.println(n);
        }
        //Arrays of Objects

        Books[] book = new Books[2];
        book[1]=new Books("The Hobbit","J.R.R Tolkien");
        book[0]=new Books("1984","George Orwell");
        for(Books b:book){
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
        // Common Array Operations
        int[] og={1,2,5,4,3};
        int[] duplicate=new int[og.length];
        
        System.arraycopy(og, 0, duplicate, 0, og.length);

        Arrays.sort(duplicate);

        System.out.println("Original:");
        for(int i:og){
            System.out.println(i);
        }

        System.out.println("Sorted:");
        for(int i:duplicate){
            System.out.println(i);
        }
        //The Arrays Utility Class
        int[] ex1={1,2,5,6,9};
        int[] ex2={1,2,3,4,5};

        for (int i=0;i<Math.min(ex1.length, ex2.length); i++) {
            if (Arrays.binarySearch(ex1, i)==Arrays.binarySearch(ex2, i)) {
                System.out.println("Index "+i+" matches");
            } else {
                System.out.println("Index "+i+" doesn't match");
            }
        }
        System.out.println("Arrays are the same: "+Arrays.equals(ex1, ex2));
        //Cloning Arrays
        System.out.println();
        int[] origin={2,1,5,3,4};
        int[] copy= origin.clone();

        Arrays.sort(copy);
        System.out.println("Original array: "+Arrays.toString(origin));
        System.out.println("Cloned array: "+Arrays.toString(copy));
        System.out.println("Arrays match: "+Arrays.equals(origin, copy));
        System.out.println();

        //2d arrays
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
                sum+=matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum: "+sum);

        //Passing arrays to methods
        System.out.println();
        int[] toDouble={1,2,3,4,5};
        int[] doubled=ArrayDoubling.doubling(toDouble);
        System.out.println("Doubled Array: "+Arrays.toString(doubled));
    }
}
