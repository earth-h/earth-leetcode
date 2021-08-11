class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        ans = []
        for li in image:
            li.reverse()

        return [[i ^ 1 for i in li] for li in image]