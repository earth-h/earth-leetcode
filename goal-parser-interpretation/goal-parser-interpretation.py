class Solution:
    def interpret(self, command: str) -> str:
        ans = ""
        for s in range(len(command)):
            if command[s] == "G":
                ans += "G"
            elif command[s] == "(" and command[s + 1] == ")":
                ans += "o"
            elif command[s] == "(" and command[s + 1] == "a":
                ans += "al"
        return ans