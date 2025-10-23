package ie.atu.arrays;

public class ArrayDoubling {
    public static int[] doubling(int[] ArrayInput){
        int[] result = new int[ArrayInput.length];

        for(int i = 0; i < ArrayInput.length; i++){
            result[i] = ArrayInput[i] * 2;
        }
        return result;
    }
}
