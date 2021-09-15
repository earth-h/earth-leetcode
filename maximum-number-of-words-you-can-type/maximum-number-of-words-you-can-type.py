class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        ans, cnt = 0, []
        for s in text.split(' '):
            cnt.append(collections.Counter(s))
        for counter in cnt:
            isWord = True
            for b in brokenLetters:
                if b in counter.keys():
                    isWord = False
                    continue
            if isWord:
                ans += 1
        return ans