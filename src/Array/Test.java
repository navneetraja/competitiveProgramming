package Array;

public class Test {

    public static void main(String [] args){
        int [] prices = {7,1,5,3,6,4};

        int buy = prices[0];
        int profit=0;
        int totalprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else if((prices[i]-buy) > profit){
                profit = prices[i]-buy;
                System.out.println("profit "+profit);
                totalprofit = totalprofit + profit;
            }
        }
        System.out.println("totalprofit "+totalprofit);

    }
}
