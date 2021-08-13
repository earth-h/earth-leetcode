class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        # first = s[:len(s)/2]
        # second = s[len(s)/2:]
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        left = right = 0
        for i in s[:len(s)//2]:
            if i in vowels:
                left += 1
        for i in s[len(s)//2:]:
            if i in vowels:
                right += 1
            if left < right:
                return False
        if left == right:
            return True
        else:
            return False