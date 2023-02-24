public class getLargestElement_07 {

    public static int getLargestElement(int[] arr) {
        // TODO:
        int result=arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>result){
                result = arr[i];
            }
        }

        return result;

    }
}
