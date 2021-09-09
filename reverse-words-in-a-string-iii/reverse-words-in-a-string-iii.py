class Solution:
    def reverseWords(self, s: str) -> str:
        return " ".join(str[::-1] for str in s.split(" "))