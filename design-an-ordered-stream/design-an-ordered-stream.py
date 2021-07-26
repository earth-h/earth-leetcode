class OrderedStream:
    def __init__(self, n: int):
        self.chunkList = [""] * n    
        self.ptr = 0
        
    def insert(self, idKey: int, value: str) -> List[str]:
        self.chunkList[idKey - 1] = value
        
        tmpChunk = list()
        
        if self.chunkList[self.ptr] == "":
            return []
        else:
            for i in range(self.ptr, len(self.chunkList)):
                if self.chunkList[i] == "":
                    self.ptr = i
                    return tmpChunk
                elif i == len(self.chunkList) - 1:
                    tmpChunk.append(self.chunkList[i])
                    return tmpChunk 
                else:
                    tmpChunk.append(self.chunkList[i])
    

# Your OrderedStream object will be instantiated and called as such:
# obj = OrderedStream(n)
# param_1 = obj.insert(idKey,value)