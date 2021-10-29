package demo01;

public class ArrayTest {

    public static void main(String[] args) {
    int[] ints = new int[10];
        for (int i = 0; i < 5; i++) {
            ints[i] = i;
        }
        System.out.println(ints.length);
    }
}
