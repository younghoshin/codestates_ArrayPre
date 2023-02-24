import java.util.Arrays;

public class getEvenNumbers_09 {

    public int[] getEvenNumbers(int[] arr) {
        // TODO:
        int howLong=0;
        for(int i =0; i<arr.length; i++){
            if (arr[i]%2==0){
                howLong++;
            }
        }
        int[] get_Arr = new int[howLong];
        int is=0;
        for (int j =0; j<arr.length; j++){
            if (arr[j]%2==0){
                get_Arr[is]=arr[j];
                is++;
            }
        }
        return get_Arr;
    }


}
