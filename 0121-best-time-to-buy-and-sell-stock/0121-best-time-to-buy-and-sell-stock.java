class Solution {
    public int maxProfit(int[] a) {
         int min,cost,profit,i;
        min = a[0];profit = 0;
        for(i=1;i<a.length;i++)
        {
            cost=a[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,a[i]);
        }
        return profit;
    }
}