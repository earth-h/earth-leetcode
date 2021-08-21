class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        # white: True, black: False
        # (alphabet - 'a') % 2 == 0 => odd number False
        # (alphabet - 'a') % 2 != 0 => even number False
        # => XOR 
        if (ord(coordinates[0]) - ord('a')) % 2 ^ int(coordinates[1]) % 2:
            return False
        return True