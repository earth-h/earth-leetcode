class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        ansLen = 0
        ansCnt = 0
        
        for i in range(len(rectangles)):
            if ansLen < min(rectangles[i][0], rectangles[i][1]):
                ansLen = min(rectangles[i][0], rectangles[i][1])
                ansCnt = 1
            elif ansLen == min(rectangles[i][0], rectangles[i][1]):
                ansCnt += 1
                
        return ansCnt