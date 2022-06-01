from typing import List


class Solution:
    def average(self, salary: List[int]) -> float:
        salary.sort()
        salary.pop(0)
        salary.pop(len(salary) - 1)
        return sum(salary)/len(salary)


# Executing function

solution = Solution()
print(solution.average([1000, 2000, 3000]))
