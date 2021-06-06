class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        sList = {k: v for v, k in enumerate(s)}
        # ex) {'a': 8, 'b': 5, 'c': 7, 'd': 14, 'e': 15, 'f': 11, 'g': 13, 'h': 19, 'i': 22, 'j': 23, 'k': 20, 'l': 21}
        ans = list()
        
        tmpLocation = 0
        while tmpLocation < len(s):
            maxLocation = sList[s[tmpLocation]]
            curLocation = tmpLocation
            while tmpLocation <= maxLocation:
                if sList[s[tmpLocation]] > maxLocation:
                    maxLocation = sList[s[tmpLocation]]
                tmpLocation += 1
            ans.append(maxLocation - curLocation + 1)
        '''
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
        '''
        return ans