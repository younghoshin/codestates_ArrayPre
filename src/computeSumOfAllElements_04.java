public class computeSumOfAllElements_04 {
    public int computeSumOfAllElements(int[] arr) {
        // TODO:
        int sum=0;
        if(arr.length == 0 ) return 0;
        for(int i =0; i< arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;

    }
}
