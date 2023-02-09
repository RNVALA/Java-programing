class test {
    static int arr[] = new int[] { 10, 11, 12, 13, 15, 17, 18 };
    int size = arr.length;

    int getintcount(int n) {
        int inversioncount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    inversioncount++;
                }
            }
        }
        return inversioncount;
    }
}

public class inversionmergesort {
    public static void main(String[] args) {
        test ronak = new test();
        System.out.println(ronak.getintcount(ronak.size));

    }

}