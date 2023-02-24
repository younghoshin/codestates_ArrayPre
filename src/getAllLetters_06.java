public class getAllLetters_06 {
    public char[] getAllLetters(String str) {
        // TODO:
        char[] get_Letter = new char[str.length()];

        for(int i=0; i<get_Letter.length;i++){
            get_Letter[i]=str.charAt(i);
        }

        return get_Letter;
    }
}
