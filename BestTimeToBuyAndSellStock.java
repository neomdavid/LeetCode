class BestTimeToBuyAndSellStock {
  //this was ez.
  public int maxProfit(int[] prices) {
      int l = 0;
      int r = 1;
      int maxProfit = 0;
      while(r<prices.length){
          int profit = prices[r] - prices[l];
          maxProfit = Math.max(profit, maxProfit);
          if(prices[r] > prices[l]){
              r++;
          } else {
              l = r;
              r++;
          }
      }
      return maxProfit;
  }
}