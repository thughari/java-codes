from collections import deque

def invasion_time(N, M, Q):
    grid = [list(row) for row in Q]
    directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    queue = deque()
    enemy_cells = 0
    
    for i in range(N):
        for j in range(M):
            if grid[i][j] == 'A':
                queue.append((i, j))
            elif grid[i][j] == 'E':
                enemy_cells += 1
                
    if enemy_cells == 0:
        return 0
    
    time = 0
    while queue:
        size = len(queue)
        time += 1
        for _ in range(size):
            x, y = queue.popleft()
            
            for direction in directions:
                newX, newY = x + direction[0], y + direction[1]
                
                if 0 <= newX < N and 0 <= newY < M and grid[newX][newY] == 'E':
                    grid[newX][newY] = 'A'
                    queue.append((newX, newY))
                    enemy_cells -= 1
                    if enemy_cells == 0:
                        return time
                        
    return -1

# Example usage
Q1 = ["AE", "*E","EE"]
print(invasion_time(2, 2, Q1))  # Output: 2

Q2 = ["AE", "**", "EE"]
print(invasion_time(3, 2, Q2))  # Output: 2
