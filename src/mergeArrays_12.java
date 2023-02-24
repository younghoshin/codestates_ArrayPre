public class mergeArrays_12 {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO:
        int[] cnt = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, cnt, 0, arr1.length);
        System.arraycopy(arr2, 0, cnt, arr1.length, arr2.length);

        return cnt;




    }

}


//    int[] concat_arr= new int[arr1.length+arr2.length];
//
//        for (int i = 0; i< concat_arr.length; i++){
//        concat_arr[i] = arr1[i];
//        concat_arr[i+1]=arr2[i];
//        }
//        return concat_arr;
