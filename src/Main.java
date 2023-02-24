import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrs= {1,2,3,4};
        getLongestWord_08 get = new getLongestWord_08();
        getEvenNumbers_09 gets = new getEvenNumbers_09();
        fibonacci_19 fi =new fibonacci_19();
        int[] arr=fi.fibonacci(8);
        int[] getEven_check=gets.getEvenNumbers(arrs);

        System.out.println("Hello world!");
        System.out.println(get.getLongestWord("i dont no"));
        System.out.println(Arrays.toString(getEven_check));
        System.out.println(Arrays.toString(arr));
    }
}