Scanner input = new Scanner(System.in);
System.out.println("Enter the array size: ");
int n = input.nextInt();

public class bubbleSort {
    public static int[] randIntArr(int count){
        long time = System.nanoTime();
        utils.bubbleSort(randIntArr);
        time = System.nanoTime() - time;

        System.out.println("Time Taken: " + time);

    }
}
