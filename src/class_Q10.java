public class class_Q10 {
    public static void main(String[] args) {
        int numbers [] = {1,5,8,9};
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (largest<numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.println(largest);
        for (int i = 0; i < numbers.length; i++) {
            if (smallest>numbers[i]) {
                smallest = numbers[i];
            }}
        System.out.println(smallest);
       System.out.print("The difference between thr largest and smallest is ");
        System.out.println(largest-smallest);
    }
}
