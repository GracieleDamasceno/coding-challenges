class Solution:
    def hammingWeight(self, n: int) -> int:
        return bin(n).count('1')


# Executing function

solution = Solution()
print(solution.hammingWeight(0o0000000000000000000000000001011))
