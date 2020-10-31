# Source
https://codeforces.com/problemset/problem/607/A

# Problem Statement
There are n beacons located at distinct positions on a number line. The i-th beacon has position ai and power level bi. When the i-th beacon is activated, it destroys all beacons to its left (direction of decreasing coordinates) within distance bi inclusive. The beacon itself is not destroyed however. Saitama will activate the beacons one at a time from right to left. If a beacon is destroyed, it cannot be activated.

Saitama wants Genos to add a beacon strictly to the right of all the existing beacons, with any position and any power level, such that the least possible number of beacons are destroyed. Note that Genos's placement of the beacon means it will be the first beacon activated. Help Genos by finding the minimum number of beacons that could be destroyed.

# Input
The first line of input contains a single integer n (1 ≤ n ≤ 100 000) — the initial number of beacons.

The i-th of next n lines contains two integers ai and bi (0 ≤ ai ≤ 1 000 000, 1 ≤ bi ≤ 1 000 000) — the position and power level of the i-th beacon respectively. No two beacons will have the same position, so ai ≠ aj if i ≠ j.

# Output
Print a single integer — the minimum number of beacons that could be destroyed if exactly one beacon is added.
