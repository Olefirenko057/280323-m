public class Main2 {
    public static void main(String[] args) {
        System.out.println(myMethod(new int []{1,3,4,8}));
    }

    public static int myMethod(int[] array) {
        int sum = 0;
        int startPoint = 0;
        int finishPoint = array.length - 1;
        while(startPoint != array.length) {
            if(array[startPoint] % 2 == 0 && array[finishPoint] % 2 == 1) {
                sum += array[startPoint] + array[finishPoint];
            }
            startPoint++;
            finishPoint--;
        }
        return sum;
    }
}
