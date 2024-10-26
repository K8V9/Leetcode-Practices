class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1; //j is the number of unique element(s) in the array, starts at 1 because the first element is always unique
        for(int i=1; i<nums.length; i++){ //starts at index 1 because index 0 will always be the first unique element
            if(nums[i] != nums[i-1]){ //check if the current element is the same as the previous element, if not then
                nums[j] = nums[i]; //overwrites the value of current element
                j++; //increment of j
            }
        }
        return j; // return the total number of unique elements
    }
}

//Apply 2 pointers approach i an j. 
