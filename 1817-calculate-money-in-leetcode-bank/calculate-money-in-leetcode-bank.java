class Solution {
  public int totalMoney(int n) {
  int totalMoney = 0;
  int dailySum = 0, weeksCount = 0;

  // Loop through each day from 1 to n
  for (int day = 1; day <= n; day++) {
    // Check if it's the first day of a week
    if (day % 7 == 1) {
      weeksCount++;  // Increment the week count
      dailySum = weeksCount;  // Reset the daily sum for a new week
    } else {
      dailySum++;  // Increment the daily sum for the current week
    }

    // Accumulate the daily sum to the total money
    totalMoney += dailySum;
  }

  // Return the total money after n days
  return totalMoney;
}

}