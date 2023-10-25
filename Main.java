public class Main {
    public static void main(String[] args) {
        int[] array = {2,6,5,1,3,4};
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[ j + 1 ] = tmp;
        }
        for( int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}