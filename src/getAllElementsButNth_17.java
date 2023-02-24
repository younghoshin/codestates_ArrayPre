public class getAllElementsButNth_17 {
    public int[] getAllElementsButNth(int[] arr, int n) {
        // TODO:

        if(n>arr.length-1){
            return arr;
        }
        int[] arr1 = new int[arr.length-1];
        int cnt=0;
        for (int i = 0; i< arr1.length-1;i++){
            if(i==n){
                arr1[i]=arr[i+1];
                cnt++;
            }
            else if(cnt==1){
                arr1[i]=arr[i+1];
            }
            else arr1[i]=arr[i];
        }
        return arr1;

    }
}
