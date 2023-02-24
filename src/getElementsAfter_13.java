public class getElementsAfter_13 {

    public int[] getElementsAfter(int[] arr, int n) {
        // TODO:
        if(n>arr.length){
            int[] arr1= new int[]{};
            return arr1;
        }

        int[] arr1= new int[arr.length-n];
        int cnt=0;
        cnt=n;
        System.arraycopy(arr,cnt,arr1,0,arr1.length);
        return  arr1;

    }


}
