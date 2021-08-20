class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        counter = collections.Counter(s)
        a = s[0]
        for k in counter.keys():
            if counter[k] == counter[a]:
                continue
            else:
                return False
        return True