class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        '''
        return [i for i in nums if i % 2 == 0] + [i for i in nums if i % 2 != 0]
        '''
        beg, end = 0, len(nums) - 1
        
        while beg <= end:
            if nums[beg] % 2 == 0:
                beg += 1
            else:
                nums[beg], nums[end] = nums[end], nums[beg]
                end -= 1
        
        return nums