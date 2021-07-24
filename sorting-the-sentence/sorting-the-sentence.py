class Solution:
    def sortSentence(self, s: str) -> str:
        s_list = s.split()
        ans_list = [""] * len(s_list)
        
        for i in s_list:
            ans_list[int(i[-1]) - 1] = i[:-1]
            print(ans_list[int(i[-1]) - 1])

        return " ".join(ans_list)