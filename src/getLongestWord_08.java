public class getLongestWord_08 {
    public String getLongestWord(String str) {
        // TODO:
        String[] arr= str.split(" ");
        String num = arr[0];

        for (int i =0; i<arr.length; i++){
            if(arr[i].length() > num.length()){
                num = arr[i];
            }
        }
        return num;
    }
}
