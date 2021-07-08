# 특정 원소가 속한 집합을 찾기
def find_parent(x):
    if parent[x] == x: return x
    parent[x] = find_parent(parent[x])
    return parent[x]

# 두 원소가 속한 집합을 합치기
def union_parent(a, b):
    a = find_parent(a)
    b = find_parent(b)
    if a < b: parent[b] = a
    else: parent[a] = b

# 노드의 개수와 간선(Union 연산)의 개수 입력 받기
v, e = map(int, input().split())
parent = [i for i in range(v + 1)] # 부모 테이블 초기화하기

# Union 연산을 각각 수행
for i in range(e):
    a, b = map(int, input().split())
    union_parent(a, b)

# 각 원소가 속한 집합 출력하기
print("각 원소가 속한 집합 : ", end='')
for i in range(1, v + 1):
    print(find_parent(i), end=' ')

print()

# 부모 테이블 내용 출력하기
print("부모 테이블 : ", end='')
for i in range(1, v + 1):
    print(parent[i], end=' ')

"""
6 4
1 4
2 3
2 4
5 6
"""