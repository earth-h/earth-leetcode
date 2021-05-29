class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        sortedGroupSizes = sorted(groupSizes, reverse=True)
        # tmpList[index] => (people count == index) group
        tmpList = [[] for _ in range(sortedGroupSizes[0])]
        ansList = list()
        
        for person in range(len(groupSizes)):
            # grouping
            if tmpList[groupSizes[person] - 1] == [] or len(tmpList[groupSizes[person] -1][-1]) >= groupSizes[person]:
                tmpList[groupSizes[person] - 1].append([person])
            else:
                tmpList[groupSizes[person] - 1][-1].append(person)
            
            # make answer List
            if len(tmpList[groupSizes[person] - 1][-1]) == groupSizes[person]:
                    ansList.append(tmpList[groupSizes[person] -1][-1])
                    
        return ansList
        