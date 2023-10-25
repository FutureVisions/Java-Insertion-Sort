public class insertion_sort_char {
    public static void main(String[] args) {
        String name = "Steak";
        String end = name.toLowerCase();
        char[] chars = end.toCharArray();
        for ( int i = 0; i < end.length(); i++) {
            char temp = chars[i];
            int j = i - 1;
            while(j >= 0 && chars[j] > temp) {
                chars[ j + 1] = chars[j];
                j--;
            }
            chars[j + 1] = temp;
        }
        for( int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}