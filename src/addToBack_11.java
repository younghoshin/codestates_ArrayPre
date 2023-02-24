public class addToBack_11 {
    public int[] addToBack(int[] arr, int el) {
        // TODO:
        int[] arrs= new int[arr.length+1];
        arrs[arrs.length-1]=el;
        System.arraycopy(arr,0,arrs,0,arr.length);
        return arrs;

    }
}
