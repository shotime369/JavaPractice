
    import java.util.Random;

    public class FisherYatesShuffle {
        public static void shuffle(int[] array) {
            Random rand = new Random();
            for (int i = array.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                // Swap array[i] with the element at random index
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7 ,8 ,9};
            shuffle(array);
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }

