class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jew_set = set(jewels)
        answer = 0
        for stone in stones:
            if stone in jew_set:
                answer += 1
        return answer 

