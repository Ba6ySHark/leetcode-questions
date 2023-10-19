class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        left_pointer = 0
        right_pointer = 1
        length = len(nums)

        while right_pointer < length:
            if nums[left_pointer] != nums[right_pointer]:
                left_pointer += 1
                nums[left_pointer] = nums[right_pointer]

            right_pointer += 1
        
        return left_pointer + 1
        