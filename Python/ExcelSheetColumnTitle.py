class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        res=[]
        while columnNumber>0:
            columnNumber-=1
            d=columnNumber%26
            c=chr(ord('A')+d)
            res.append(c)
            columnNumber//=26
        return ''.join(reversed(res))
