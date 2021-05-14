class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        n = len(boxes) 
        
        # result[i] = boxes[0] * abs(0-i) + boxes[1] * abs(1-i) + ... + boxes[i] * abs(i-i) + ... + boxes[n-1] * abs(n-1-i)

        result = []
        for i in range(n):
            result.append(0)
            for j in range(n):
                if boxes[j] == "1":
                    result[i] =  result[i] + int(boxes[j]) * abs(j - i) 
                
        return result
            