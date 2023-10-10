public class VariableLengthArguement {
    public static void main(String[] args) {
        int sum1 = sum(3, 4, 5, 6);
        int sum2 = sum(9, 7, 98, 6);
        System.out.println("Sum1 :" + sum1);
        System.out.println("Sum2 :" + sum2);

    }
    public static int sum(int... num){
        int summation = 0;
        for (int n:num){
            summation += n;
        }
        return summation;
    }

}
