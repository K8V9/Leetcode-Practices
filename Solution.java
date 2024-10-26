class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0, i=m; j<n; j++){ //starting the traversal of nums2
            nums1[i] = nums2[j]; //append elements from nums2 to nums1
            i++; //traversing nums1 with i
        }
        Arrays.sort(nums1);
    }
}

//Travese through nums2 and add its elements to nums1, then use sort() to put elements in order.