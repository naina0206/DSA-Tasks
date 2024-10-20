class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0; int ten=0; int twenty=0; 
        int l=0;
        while(l<bills.length){
            if(bills[l]==5){
                five++;
            }
            else if(bills[l]==10){
                if(five>=1){
                    five--;
                }
                else
                return false;
                ten++;
            }
            else if(bills[l]==20){
               if(five>=1 && ten>=1){
                    five--; ten--;
                }
                else if(five>=3){
                    five=five-3;
                }
                else
                return false;
                twenty++;
            }
            l++;
        }
        return true;
    }
}