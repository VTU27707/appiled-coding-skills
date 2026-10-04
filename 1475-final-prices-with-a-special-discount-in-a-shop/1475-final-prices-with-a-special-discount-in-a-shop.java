class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();
        int[] stack = new int[n];
        int top = -1;
        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && stack[top] > prices[i]) {
                top--;
            }
            if (top >= 0) {
                ans[i] = prices[i] - stack[top];
            }
            stack[++top] = prices[i];
        }

        return ans;
    }
}
