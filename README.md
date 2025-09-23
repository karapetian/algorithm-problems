# algorithm-problems
Algorithm Problems with Solutions

1. 2-3 pointers: с двух сторон; Каждому массиву по указателю; Медленый и быстрый указатели(поменять местами или сравнить)
2. binary search - classic problem: Есть упорядоченный массив целых чисел arr, нужно определить, есть ли в нём число X.
В общем и худшем случае интервал поиска на каждом шаге алгоритма будет сокращаться в два раза. Изначально он равен 𝑁, 
после одной итерации он будет содержать N/2 элементов, затем N/4, на 𝑘 k-й итерации в нём будет N/2k элементов. 
Как только 2 𝑘 станет больше 𝑁, алгоритм завершится.
Некоторые задачи формально не удовлетворяют условию монотонности и, тем не менее, решаются бинарным поиском (see src/main/java/org/example/algo/practicum/yandex/, binary_search_3).
   https://kinescope.io/hMQRNHaRWXkvkEVM2GSj3c
   Бинарный поиск можно применить, если можем разделить данные на хорошие и плохие, при этом сначала идут все "хорошие", 
а потом все "плохие". Главная задача бин. поиска: найти последний хороший и первый плохой!
ПАТТЕРН БИНАРНЫЙ ПОИСК:
   #01 Для нескольких примеров выбрать элемент, который мы будем искать
   #02 Определить в каком указателе ответ (левый или правый) + начальную позицию указателей
   #03 Придумать функцию good, которая подойдет для всех примеров. In good function you can only have the target, array and middle value
3. Fibonachi
4. В реальной жизни рекурсию очень удобно применять для обхода графов или деревьев — таких как файловая система. Метод называется «поиск в глубину».
Dynamic prog
5. бывает удобно работать с упорядоченными данными. Как правило, условия задачи не гарантируют, что данные отсортированы. 
Поэтому при решении нужно понять, что требуется сначала отсортировать данные, а затем применить один из указанных методов.
6. деревья — частный случай графов
7. Trie data structure: https://www.geeksforgeeks.org/trie-insert-and-search/
8. We use **Queue for BFS** and **Stack for DFS**. In the first round, we process the root node. In the second round, we 
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
11. Counting Sort - Time O(n+k) and Space O(n+k); efficient when the range of input values is small compared to the number
of elements to be sorted. The basic idea behind Counting Sort is to count the frequency of each distinct element in the 
input array and use that information to place the elements in their correct sorted positions. The Range should be smaller
than the number of elements
12. https://almond-city-dee.notion.site/195f64241af0809bb6f9f76b85c328e1
    https://www.youtube.com/watch?v=6h-blOjL43s
13. HEAP (Priority Queue)- Kth largest element; top K frequent element. A heap is a special kind of binary tree.
It's a **complete binary tree** (every level is completely filled except possibly the last, which is filled from left to right).
In a min heap the parent node is always less than or equal to its children. The smallest element is at the root.
In a max heap the parent node is always greater than or equal to its children. The largest element is at the root.
For Insert add the new element at the end (last level, next open spot). Then "heapify up" to restore the heap property.
For delete (usually the root) replace the root with the last element. Then "heapify down" to restore the heap property.
https://www.youtube.com/watch?v=VEYSSANa-cw
15. HashTable - Anagrams
16. Sorting - use O(n2) only when you have O(1) place complexity
17. BST (Binary Search Tree) - the right part nodes are bigger than the root, and the left nodes are smaller.
Recursively look at the left part, add them into the results. Recursively look at the left part, and go back to the Root.
https://www.youtube.com/watch?v=8K7EO7s_iFE
18. You have a large file (32 GB) where each line contains a single word. The machine has only 4 GB of operational memory (RAM).
Sort the words in the file in ascending order.
Solution: Split the 32 GB file into smaller chunks that fit into memory (e.g., 8 chunks of ~4 GB each).
Read each chunk into memory, sort the words using an efficient algorithm (like quicksort or mergesort), and write the sorted words back to temporary files.
Merge: Use a **min-heap** to merge the sorted chunks: Open all sorted chunk files. Initialize the heap with the first word from each file.
Repeatedly extract the smallest word from the heap, write it to the final output, and replenish the heap with the next word from the corresponding file.
Continue until all words from all chunks are processed.

https://www.linkedin.com/posts/ankitapy_dsa-leetcode-interview-activity-7298578598326677504-iL9e?utm_source=social_share_send&utm_medium=member_desktop_web&rcm=ACoAAC5CJqwBXQwpcP8dFhZwCWAJx3-8YrTh96I
https://leetcode.com/discuss/post/449135/how-to-effectively-use-leetcode-to-prepa-m7gt/
https://leetcode.com/discuss/post/494279/comprehensive-data-structure-and-algorit-tdez/

19. int mid = startPos + (endPos - startPos) / 2;