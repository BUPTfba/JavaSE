package OOP01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtils {
    //数组初始化
    public void init(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100 - 0 + 1));
        }
    }


    /**
     * 求数组最大值
     */

    public int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //求数组最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    //求数组的平均值
    public int getAvg(int[] arr) {
        int avg=0;
        avg = this.getSum(arr) / arr.length;

        return avg;
    }

    //反转数组

    /**
     *
     * 不可以直接进行翻转！！！！！！！！！！
     */
    public void getReverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }


    }

    //复制数组
    public int[] getCopy(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];

        }

        return temp;
    }

    //数组排序
    public void sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    //遍历数组
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("元素"+i+"值为"+arr[i]);
        }
//        Arrays.toString(arr);
    }

    //查找指定元素
    public int getIndex(int[] arr, int dest) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest) {
                dest = i;
                flag = false;
                /**
                 * 这里return有替代break的作用！！！！！！！不仅结束循环，还直接结束了整个方法
                 */
                return i;
            }
        }

            return -1;
    }
}
