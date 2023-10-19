class Solution {
    public int removeElement(int[] nums, int val) {
        int left_pointer = 0;
        
        for (int right_pointer=0; right_pointer<nums.length; right_pointer++) {
            if (nums[right_pointer] != val) {
                nums[left_pointer] = nums[right_pointer];
                left_pointer++;
            }
        }

        return left_pointer;
    }
}