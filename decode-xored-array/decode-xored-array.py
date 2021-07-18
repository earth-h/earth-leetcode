class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        arr = [first]
        # A = B XOR C, C = A XOR B
        for i in range(len(encoded)):
            arr.append(arr[i] ^ encoded[i])
        return arr