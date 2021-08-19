class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        sourceCounter = collections.Counter(i for i, j in paths)
        destCounter = collections.Counter(j for i, j in paths)
        for key in destCounter.keys():
            if key not in sourceCounter:
                return key