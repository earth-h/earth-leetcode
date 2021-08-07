class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        alpha = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        ans = []
        
        for word in words:
            tmpAns = []
            for c in word:
                tmpAns.append(alpha[ord(c) - 97])
            if "".join(tmpAns) not in ans:
                ans.append("".join(tmpAns))
                
        return len(ans)