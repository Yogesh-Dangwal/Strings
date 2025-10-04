public class PrintLargestString {
    public static String LargestString(String fruits[]){
        String Largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(Largest.compareTo(fruits[i]) < 0){ //.compareToIgnoreCase
                Largest = fruits[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "banana", "mango"};
        System.out.println(LargestString(fruits));
    }
}
