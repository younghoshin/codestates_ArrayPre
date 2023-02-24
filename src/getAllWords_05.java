public class getAllWords_05 {
    public String[] getAllWords(String str) {
        // TODO:
        String[] str_concat = new String[]{};
        if(str.isEmpty()) {
            return str_concat;
        }
        str_concat = str.split(" ");
        return str_concat;

    }

}
