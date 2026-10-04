class Solution {
    public void moveZeroes(int[] a) {
        int i,j;i=0;j=0;
        for ( i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                j++;
            }
        }
    }
}