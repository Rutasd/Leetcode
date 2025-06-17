package SlidingWindow;

public class BestTimeToBuyAndSellAStock {
    public int maxProfit1(int[] prices) {
        int maxP = 0;
        int l = 0;
        int r = l + 1;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                maxP = Math.max(maxP, prices[r] - prices[l]);
            }
            else {
                l = r;
            }
            r = r + 1;
        }
        return maxP;
    }
    public int maxProfit2(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}
