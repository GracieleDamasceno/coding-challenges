from typing import List


class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        for i in range(2, len(arr), 1):
            if arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2]:
                return False
        return True


# Executing function

solution = Solution()
print(solution.canMakeArithmeticProgression([1, 2, 4]))
