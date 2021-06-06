class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        #print(ord('z') - ord('a') + 1) # the number of alphabet
        #alphabet = [0 for _ in range(ord('z') - ord('a') + 1)]
        alphabet = [[0,0] for _ in range(26)]
        ans = list()
        
        for i in range(len(s)):
            strNum = ord(s[i]) - ord('a')
            if alphabet[strNum][0] == 0:
                alphabet[strNum][0] = i
            alphabet[strNum][1] = i
        
        curLocation = 0
        lastLocation = 0
        
        while curLocation < len(s): 
            strNum = ord(s[curLocation]) - ord('a')
            maxNum = alphabet[strNum][1]
            j = curLocation + 1
            while j <= maxNum:
                checkStrNum = ord(s[j]) - ord('a')
                if alphabet[checkStrNum][1] > maxNum:
                    maxNum = alphabet[checkStrNum][1]
                #print("curAlpha: ",s[j],"curLocation: ", curLocation, "maxNum: ", maxNum, "lastLocation: ",lastLocation)
                j += 1
            curLocation = maxNum + 1
            ans.append(curLocation - lastLocation)
            lastLocation = curLocation
            
        return ans