lass Solution {
    public int[] getConcatenation(int[] nums) {
        int[] new_nums = new int[nums.length*2];

        for (int i=0; i<new_nums.length; i++) {
            new_nums[i] = nums[i%nums.length];
        }

        return new_nums;
    }
}