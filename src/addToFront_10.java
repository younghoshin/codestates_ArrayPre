public class addToFront_10 {
    public int[] addToFront(int[] arr, int el) {
        // TODO:
        int[] arrs= new int[arr.length+1];
        arrs[0]=el;
        System.arraycopy(arr,0,arrs,1,arr.length);
        return arrs;

    }
}
