class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        strToList = s.split()
        return " ".join(strToList[:k])