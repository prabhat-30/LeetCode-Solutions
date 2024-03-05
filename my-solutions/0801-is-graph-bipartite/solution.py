class Solution:     
    def isBipartite(self, graph: List[List[int]]) -> bool:
        def dfs(node, color):
            if colors[node] != 0:
                return colors[node] == color
            
            colors[node] = color
            for n in graph[node]:
                if not dfs(n, -color):
                    return False
            return True
        
        def reset_colors():
            return [0] * len(graph)
        
        colors = reset_colors()
        for node in range(len(graph)):
            if colors[node] == 0:
                if not dfs(node, 1):
                    return False
        return True

        
