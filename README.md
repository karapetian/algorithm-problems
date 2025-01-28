# algorithm-problems
Algorithm Problems with Solutions

1. 2-3 pointers
2. binary search - classic problem: Есть упорядоченный массив целых чисел arr, нужно определить, есть ли в нём число X.
В общем и худшем случае интервал поиска на каждом шаге алгоритма будет сокращаться в два раза. Изначально он равен 𝑁 N, 
после одной итерации он будет содержать 𝑁 / 2 N/2 элементов, затем 𝑁 / 4 N/4, на 𝑘 k-й итерации в нём будет 𝑁 / 2 𝑘 N/2 k элементов. 
Как только 2 𝑘 2 k станет больше 𝑁 N, алгоритм завершится.
Некоторые задачи формально не удовлетворяют условию монотонности и, тем не менее, решаются бинарным поиском (see src/main/java/org/example/algo/practicum/yandex/, binary_search_3).
3. Fibonachi
4. В реальной жизни рекурсию очень удобно применять для обхода графов или деревьев — таких как файловая система. Метод называется «поиск в глубину».
Dynamic prog
5. бывает удобно работать с упорядоченными данными. Как правило, условия задачи не гарантируют, что данные отсортированы. 
Поэтому при решении нужно понять, что требуется сначала отсортировать данные, а затем применить один из указанных методов.
6. деревья — частный случай графов
7. Trie data structure: https://www.geeksforgeeks.org/trie-insert-and-search/
8. We use Queue for BFS and Stack for DFS. In the first round, we process the root node. In the second round, we 
poll (returns and removes the element) the root and process the nodes next to the root node. In the third round, we 
process the nodes which are two steps from the root node, e.i poll from to find the nodes next to it. So on and so forth.
It is important to make sure that we never visit a node twice. Otherwise, we might get stuck in an infinite loop, e.g. in graph with cycle.
So we can keep a hashSet to store the visited nodes. Or we can use a boolean array to store the visited nodes.
9. Depth-First Search (DFS) can also be used to find the path from the root node to the target node. We start from the root node A. 
Firstly, we choose the path to the node B and trace-back till we reach the end where we have no way to go deeper. Then we
backtrack to A and choose the second path to the node C. We repeat the process until we find the target node. 
10. In most cases, we can also use DFS when using BFS. But there is an important difference: the traversal order. 
Different from BFS, the nodes you visit earlier might not be the nodes which are closer to the root node. As a result, 
the first path you found in DFS might not be the shortest path.
11. 