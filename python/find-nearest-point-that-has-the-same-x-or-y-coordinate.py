import math
from typing import List


class Solution:
    def nearestValidPoint(self, x: int, y: int, points: List[List[int]]) -> int:
        result = -1
        minimum_distance = math.inf
        for i in range(len(points)):
            if points[i][0] == x or points[i][1] == y:
                manhattan_distance = abs(x - points[i][0]) + abs(y - points[i][1])
                if manhattan_distance < minimum_distance:
                    result = i
                    minimum_distance = manhattan_distance
        return result


# Executing function

solution = Solution()
print(solution.nearestValidPoint(3, 4, [[1, 2], [3, 1], [2, 4], [2, 3], [4, 4]]))
