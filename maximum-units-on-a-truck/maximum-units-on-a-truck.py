class Solution:              
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        '''
        def mergeSort(x: list):
            if len(x) > 1:
                mid = len(x) // 2
                lx, rx = x[:mid], x[mid:]
                mergeSort(lx)
                mergeSort(rx)

                li, ri, i = 0, 0, 0
                while li < len(lx) and ri < len(rx):
                    if lx[li][1] < rx[ri][1]:
                        x[i] = lx[li]
                        li += 1
                    else:
                        x[i] = rx[ri]
                        ri += 1
                    i += 1
                x[i:] = lx[li:] if li != len(lx) else rx[ri:]        
        '''
        def mergeSortReverse(x: list):
            if len(x) > 1:
                mid = len(x) // 2
                lx, rx = x[:mid], x[mid:]
                mergeSortReverse(lx)
                mergeSortReverse(rx)

                li, ri, i = 0, 0, 0
                while li < len(lx) and ri < len(rx):
                    if lx[li][1] > rx[ri][1]:
                        x[i] = lx[li]
                        li += 1
                    else:
                        x[i] = rx[ri]
                        ri += 1
                    i += 1
                x[i:] = lx[li:] if li != len(lx) else rx[ri:]
                
        mergeSortReverse(boxTypes)
#        print("sort boxTypes(Reverse): ", boxTypes)
        
        ans = 0
        
        for box, unit in boxTypes:
            if truckSize >= box:
                ans += box * unit
                truckSize -= box
            else:
                ans += truckSize * unit
                break
        
        return ans