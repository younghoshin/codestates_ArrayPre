public class getAllElementsButLast_16 {
    public int[] getAllElementsButLast(int[] arr) {
        // TODO:
        if(arr.length == 0){
            return new int[]{};
        }
        int[] arr1 = new int[arr.length-1];
        System.arraycopy(arr,0,arr1,0,arr1.length);
        return arr1;
    }
}
