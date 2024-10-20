class Solution {
    public int majorityElement(int[] nums) {
        //Boyer Moore Voting algo
        int c=0; int candidate =0;
        for(int i: nums){
            if(c==0){
                candidate=i;
            }
            if(i==candidate){
                c++;
            }
            else{
                c--;
            }
        }
        return candidate;
        //If its not guarenteed that the array contains a majority element, then we have to
        // trasverse the array again and check wheteher the candidate element is in majority otr not.
    }
}