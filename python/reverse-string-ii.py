from typing import List


class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        reversed_string = ""
        should_reverse = False
        start = 0
        for i in range(len(s)):
            if i % k == 0:
                substring = s[start:i]
                if should_reverse:
                    substring = substring[::-1]
                reversed_string += substring
                should_reverse = not should_reverse
                start = i
        substring = s[start:len(s)]
        if should_reverse:
            substring = substring[::-1]
        reversed_string += substring
        return reversed_string


# Executing function

solution = Solution()
print(solution.reverseStr("abcd", 4))
