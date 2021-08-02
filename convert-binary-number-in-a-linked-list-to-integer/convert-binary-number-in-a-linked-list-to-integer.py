# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        binaryList = list()
        binaryLength = ans = 0
        while head != None:
            binaryLength += 1
            if head.val == 1:
                binaryList.append(binaryLength)
            head = head.next
        for i in binaryList:
            ans += 2 ** (binaryLength - i)
        return ans