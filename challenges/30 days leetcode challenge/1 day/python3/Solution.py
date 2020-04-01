
import sys
from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ints = set()
        for i in nums:
            if i in ints:
                ints.remove(i)
            else:
                ints.add(i)
        return ints.pop()

if len(sys.argv) < 4:
    raise ValueError("You have to write at least 3 arguments, which has to be numbers. For example, 'python3 Solution.py 1 2 2'")

sol = Solution()

ints = map(int, sys.argv[1:])

print(sol.singleNumber(ints))