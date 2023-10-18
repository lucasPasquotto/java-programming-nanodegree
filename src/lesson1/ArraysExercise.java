package lesson1;

public class ArraysExercise{

    public static void main(String[] args){
        // Add your code here
        int[] numbers = new int[5];
        String[] words = {"Ignition sequence start !", "Liftoff!"};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println(words[0]);
        System.out.println(numbers[4]);
        System.out.println(numbers[3]);
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);
        System.out.println(words[1]);

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

}