class Solution:
    def maximum69Number (self, num: int) -> int:
        num_to_str = str(num)
        for s in range(len(num_to_str)):
            if num_to_str[s] == '6':
                return int(num_to_str[:s]+'9'+num_to_str[s+1:])
        return num