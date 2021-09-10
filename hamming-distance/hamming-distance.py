class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        print(bin(x))
        print(bin(y))
        cnt = 0
        for i in range(1, max(len(bin(x)),len(bin(y))) - 1):
            if i + 1 >= len(bin(x)) and bin(y)[-i] == '1':
                #print("1, ", bin(y)[-i])
                cnt += 1
            elif i + 1 >= len(bin(y)) and bin(x)[-i] == '1':
                #print("2, ", bin(x)[-i])
                cnt += 1
            elif i + 1 < len(bin(x)) and i + 1 < len(bin(y)) and bin(x)[-i] != bin(y)[-i]:
                #print("3, ", bin(x)[-i], bin(y)[-i])
                cnt += 1
        #cnt += (max(len(bin(x)),len(bin(y)))- min(len(bin(x)),len(bin(y))))
        return cnt
        