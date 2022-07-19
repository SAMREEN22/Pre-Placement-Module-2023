class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for char in s:
            if char in '({[':
                stack.append(char)
            elif char is ')':
                if len(stack)==0 or stack[-1] != '(':
                    return False
                stack.pop()
            elif char is '}':
                if len(stack)==0 or stack[-1] != '{':
                    return False
                stack.pop()
            elif char is ']':
                if len(stack)==0 or stack[-1] != '[':
                    return False
                stack.pop()
        if len(stack)==0:
            return True
        else:
            return False
