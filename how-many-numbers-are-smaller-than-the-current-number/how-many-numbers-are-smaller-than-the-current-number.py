class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sorted_nums = sorted(nums)
        
        ans = list()
        
        for i in nums:
            temp_ans = 0
            for j in sorted_nums:
                if i > j:
                    temp_ans += 1
                else:
                    break
            ans.append(temp_ans)
        
        return ans