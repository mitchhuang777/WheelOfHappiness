public class happy_wheel {
    public static void main(String[] args) {
        // Please input the number of wheels
        int[] arr = { -10, -4, -4, -3, -2, -1, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 10 };
        double sum = 0;
        int curr = 0;
        for (int i = 0; i < 1000000; i++) {
            int times = 1;
            // Random number generator from 0 to 24
            curr = 0;
            int random = (int) (Math.random() * (arr.length));
            if (arr[random] == 20000) {
                times = 2;
                random = (int) (Math.random() * (arr.length));
            } else if (arr[random] == 30000) {
                times = 3;
                random = (int) (Math.random() * (arr.length));
            }
            curr = arr[random] * times;
            sum += curr;

        }

        System.out.println("Your average is " + sum + " points!");
        System.out.println("Average: " + sum / 1000000);

    }

}
