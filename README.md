# algorithm-problems
Algorithm Problems with Solutions

1. 2-3 pointers
2. binary search - classic problem: Есть упорядоченный массив целых чисел arr, нужно определить, есть ли в нём число X.
В общем и худшем случае интервал поиска на каждом шаге алгоритма будет сокращаться в два раза. Изначально он равен 𝑁 N, после одной итерации он будет содержать 𝑁 / 2 N/2 элементов, затем 𝑁 / 4 N/4, на 𝑘 k-й итерации в нём будет 𝑁 / 2 𝑘 N/2 k элементов. Как только 2 𝑘 2 k станет больше 𝑁 N, алгоритм завершится.
Некоторые задачи формально не удовлетворяют условию монотонности и, тем не менее, решаются бинарным поиском.
3.