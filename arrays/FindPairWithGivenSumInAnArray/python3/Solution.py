
import sys
from typing import List

class Solution:
    def solve(self, addition: int, nums: List[int]) -> List[int]:
        s = set()
        for i in nums:
            if i in s:
                return [addition - i, i]
            s.add(addition - i)
        raise ValueError("Problem trying to find the couple of numbers that add the addition variable")

if len(sys.argv) < 4:
    raise ValueError("number of arguments must be at least 3 numbers")

sol = Solution()

integers = list(map(int, sys.argv[1:]))

result = sol.solve(integers[0], integers[1:])

print(result)
