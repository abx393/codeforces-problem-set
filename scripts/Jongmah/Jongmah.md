# Source
https://codeforces.com/problemset/problem/1110/D

# Problem Statement
You are playing a game of Jongmah. You don't need to know the rules to solve this problem. You have n tiles in your hand. Each tile has an integer between 1 and m written on it.

To win the game, you will need to form some number of triples. Each triple consists of three tiles, such that the numbers written on the tiles are either all the same or consecutive. For example, 7,7,7 is a valid triple, and so is 12,13,14, but 2,2,3 or 2,4,6 are not. You can only use the tiles in your hand to form triples. Each tile can be used in at most one triple.

To determine how close you are to the win, you want to know the maximum number of triples you can form from the tiles in your hand.

# Input
The first line contains two integers integer n and m (1≤n,m≤106) — the number of tiles in your hand and the number of tiles types.

The second line contains integers a1,a2,…,an (1≤ai≤m), where ai denotes the number written on the i-th tile.

# Output
Print one integer: the maximum number of triples you can form.
