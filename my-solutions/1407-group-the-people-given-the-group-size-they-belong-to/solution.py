class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        dic = defaultdict(list)
        for i in range(len(groupSizes)):
            dic[groupSizes[i]].append(i)
        
        ans = []
        for grp, arr in dic.items():
            l1 = []
            for k in range(len(arr)):
                if len(l1) == grp:
                    ans.append(l1)
                    l1 = []
                l1.append(arr[k])
            ans.append(l1)
        
        return ans 

