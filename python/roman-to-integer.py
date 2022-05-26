class Solution:
    def romanToInt(self, s: str) -> int:
        roman_numerals = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        sum_number = 0
        # Traversing the string in reverse
        for i in range(len(s) - 1, -1, -1):
            number = roman_numerals[s[i]]
            if 3 * number < sum_number:
                sum_number = sum_number - number
            else:
                sum_number = sum_number + number
        return sum_number


# Executing function

solution = Solution()
print(solution.romanToInt("MCMXCIV"))
