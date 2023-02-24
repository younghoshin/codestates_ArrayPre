public class fibonacci_19 {
    public int[] fibonacci(int num) {
        // TODO:
        int[] arr = new int[num+1];
        arr[0]=0;
        for (int i = 1; i< arr.length; i++){
            if(i==1){
                arr[i]=i;
            }
            else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        return arr;


    }
}
