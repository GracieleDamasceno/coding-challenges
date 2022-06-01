class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product_of_digits = 1
        sum_of_digits = 0
        for i in str(n):
            product_of_digits *= int(i)
            sum_of_digits += int(i)
        return product_of_digits - sum_of_digits


# Executing function

solution = Solution()
print(solution.subtractProductAndSum(4421))
