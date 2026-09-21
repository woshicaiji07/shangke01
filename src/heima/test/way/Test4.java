package heima.test.way;

public class Test4 {
    public static void main(String[] args) {
    int[] brr = {1,2,3,4,5,6,7,8};
    int[] sql = CopyOfRange(brr,3,5);
        for (int i = 0; i < sql.length ; i++) {
            System.out.println(sql[i]);
        }

    }
    public static int[] CopyOfRange(int[]arr,int from,int to){
        int[] brr = new int[to - from];
        int index = 0;
        for (int i = from; i <to ; i++) {
        brr[index] = arr[i];
        index++;
        }
        return brr;
    }
}
