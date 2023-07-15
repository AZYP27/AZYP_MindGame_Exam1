public class class_Q6 {
    public static void main(String[] args) {
        int numbers [] = {5,4,1,8,6,9};
       int valuenow = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]< numbers[j]){
                    valuenow=numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j]= valuenow;
                }
            }
            System.out.print(numbers[i] + "\t");

        }
    }
}
