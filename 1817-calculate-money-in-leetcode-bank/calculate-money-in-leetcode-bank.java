class Solution {
  public int totalMoney(int n){
    int totalMoney = 0;
    int dailySum = 0, weekSum = 0;
    for(int day = 1; day<=n ; day++ ){
      if(day % 7 == 1)
      {
        weekSum++;
        dailySum = weekSum;
      }
      else
      {
        dailySum++;
        
      }
    totalMoney += dailySum;
      
    }
    return totalMoney;
  }
}