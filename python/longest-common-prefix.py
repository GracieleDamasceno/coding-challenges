from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()

        smallest_word = strs[0]
        longest_prefix = ""

        for i in range(len(smallest_word)):
            if strs[len(strs) - 1][i] == smallest_word[i]:
                longest_prefix += strs[len(strs) - 1][i]
            else:
                break
        return longest_prefix


# Executing function

solution = Solution()
print(solution.longestCommonPrefix(["flower", "flow", "flight"]))
