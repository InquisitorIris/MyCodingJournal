class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        else:
            temp=x
            y=0
            while temp>0:
                d=temp%10
                y=(y*10)+d
                temp//=10
            if y==x:
                return True
            return False
