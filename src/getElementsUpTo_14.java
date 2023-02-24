public class getElementsUpTo_14 {
    public int[] getElementsUpTo(int[] arr, int n) {
        // TODO:
        if(arr.length == 0||n>arr.length-1){
            return new int[]{};
        }
        int[] new_arr = new int[n];
        System.arraycopy(arr,0,new_arr,0,new_arr.length);
        return new_arr;


    }
}
