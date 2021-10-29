package OOP01;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        ArrayUtils util = new ArrayUtils();
        int[] arr = new int[10];
        util.init(arr);
        util.print(arr);
        int[] arr2 = new int[arr.length];
        arr2 = util.getCopy(arr);
        System.out.println("*********************");
        util.print(arr2);
        System.out.println(util.getSum(arr));
        System.out.println(util.getMax(arr));
        System.out.println(util.getAvg(arr));
        System.out.println(util.getIndex(arr, 5));
        util.sort(arr);
        util.print(arr);
        util.getReverse(arr);
        System.out.println("*********************");
        util.print(arr);

    }
}
