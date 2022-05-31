import math


class Solution:
    def countOdds(self, low: int, high: int) -> int:
        result = (high - low) // 2
        if high % 2 != 0 or low % 2 != 0:
            result = result + 1
        return result


# Executing function

solution = Solution()
print(solution.countOdds(8800445804, 979430543))
