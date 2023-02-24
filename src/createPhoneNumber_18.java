import java.util.Arrays;

public class createPhoneNumber_18 {
    public String createPhoneNumber(int[] arr) {
        // TODO:
//        if (arr.length == 8){
//            int[] phone_num= new int[8];
//        }
//        else if(arr.length == 11){
//            int[] phone_num= new int[11];
//        }
//        String[] mid= new String[4];
//        String[] tail= new String[4];
        int[] mid= new int[4];
        int[] tail= new int[4];



        if(arr.length==8){
            //0,4
            System.arraycopy(arr,0,mid,0,4);
            System.arraycopy(arr,4,tail,0,4);
            String str= Arrays.toString(mid).replace(",","").replace(" ","").replace("[","").replace("]","");
            String str1= Arrays.toString(tail).replace(",","").replace(" ","").replace("[","").replace("]","");
            return "(010)"+str+"-"+str1;
        }
        else{
            int[] header = new int[3];
            System.arraycopy(arr,0,header,0,3);
            System.arraycopy(arr,3,mid,0,4);
            System.arraycopy(arr,7,tail,0,4);
            String str= Arrays.toString(mid).replace(",","").replace(" ","").replace("[","").replace("]","");
            String str1= Arrays.toString(tail).replace(",","").replace(" ","").replace("[","").replace("]","");
            String head= Arrays.toString(header).replace(",","").replace(" ","").replace("[","").replace("]","");
            return "("+head+")"+str+"-"+str1;
        }

    }
}
