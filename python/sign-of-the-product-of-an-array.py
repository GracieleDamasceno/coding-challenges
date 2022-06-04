import math
from typing import List


class Solution:
    def arraySign(self, nums: List[int]) -> int:
        product = math.prod(nums)
        if product == 0:
            return 0
        elif product < 0:
            return -1
        else:
            return 1


# Executing function

solution = Solution()
print(solution.arraySign([-1, 1, -1, 1, -1]))
