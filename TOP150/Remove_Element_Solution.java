class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){ //start the traversal of nums with pointer i
            if(nums[i] != val){ //checks if element at current position is NOT the same as val, then
                nums[k] = nums[i]; //overwrites the array
                k++; //increment k, move to the next position for non-target element
            }
        }
        return k; //k here is the length of the array after done
    }
}

//Apply 2 pointers approach k and i. With k as the supposed position of non-target element and i traverses through nums
