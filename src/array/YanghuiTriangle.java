package array;

public class YanghuiTriangle {
    public static void main(String[] args) {
        int[][] arr = new int[10][];  //只相当于进行了外层初始化
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];//内层初始化 必有；否则报空指针异常!!!
            arr[i][0] = 1;
            arr[i][i] = 1;
            //理解下面这一行！！
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
