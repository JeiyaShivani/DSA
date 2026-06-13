public class ThirdLargestDistinct {

    public static void main(String[] args) {

        int[] arr = {5, 5, 5};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        int answer = (third == Integer.MIN_VALUE) ? first : third;

        System.out.println(answer);
    }
}
