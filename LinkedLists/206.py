# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        previous = None
        current = head
        while current != None:
            next = current.next
            current.next = previous
            previous = current
            current = next
        
        return previous