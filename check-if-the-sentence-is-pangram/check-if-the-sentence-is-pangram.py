class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        alpha = [0] * 26
        
        if len(sentence) < 26:
            return False
       
        for i in sentence:
            alpha[ord(i) - 97] += 1

        if sorted(alpha)[0] == 0:
            return False
        else:
            return True