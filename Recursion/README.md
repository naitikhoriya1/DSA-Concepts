# 1 -🔁 BinarySearch Problem = with Recursion – Key Idea

For a sorted array:

- Find the middle index `mid`.
- If `arr[mid] == key` → return `mid`.
- If `key < arr[mid]` → search in the left half.
- If `key > arr[mid]` → search in the right half.
- If `start index > end index` → return `-1` (not found).

## 🧠 Tip:

Recursive binary search is elegant and clean, but iterative versions are usually more memory-efficient because recursion can consume stack space on large arrays.

---

# 🔁 CutIntoSegment  Problem =  a String – Key Idea

🧠 **Goal:**

- Print all subsequences of "abc"
- A string of length n has `2^n` subsequences. For "abc", that's 8.

🔁 **Recursive Decision Tree:**

Each character has two choices:

- ✅ Include it in output
- ❌ Exclude it from output

## 🌳 Visualized as a binary tree:

```
                           "" (i=0)
                        /           \
                   ""                "a"
               /       \           /      \
           ""           "b"     "a"        "ab"
         /    \       /    \   /    \     /     \
      ""     "c"   "b"   "bc" "a"  "ac"  "ab"   "abc"
```

## 🧱 Execution Steps:

```cpp
subSequences("abc", "", 0)
├─ Exclude 'a': subSequences("abc", "", 1)
│ ├─ Exclude 'b': subSequences("abc", "", 2)
│ │ ├─ Exclude 'c': subSequences("abc", "", 3) → prints ""
│ │ └─ Include 'c': subSequences("abc", "c", 3) → prints "c"
│ └─ Include 'b': subSequences("abc", "b", 2)
│   ├─ Exclude 'c': subSequences("abc", "b", 3) → prints "b"
│   └─ Include 'c': subSequences("abc", "bc", 3) → prints "bc"
└─ Include 'a': subSequences("abc", "a", 1)
  ├─ Exclude 'b': subSequences("abc", "a", 2)
  │ ├─ Exclude 'c': subSequences("abc", "a", 3) → prints "a"
  │ └─ Include 'c': subSequences("abc", "ac", 3) → prints "ac"
  └─ Include 'b': subSequences("abc", "ab", 2)
    ├─ Exclude 'c': subSequences("abc", "ab", 3) → prints "ab"
    └─ Include 'c': subSequences("abc", "abc", 3) → prints "abc"
```

## ✅ Final Output:

```
(empty line)
c
b
bc
a
ac
ab
abc
```

🧠 **Tip:**
Subsequences are a fundamental concept in combinatorics and have applications in computer science, cryptography, and bioinformatics.

---

# 2 - 🪙 CoinChange Problem =    Recursive + Memoization (C++)

This project solves the **Coin Change** problem using a **top-down dynamic programming** (memoization) approach in C++.

---

## 🧠 Problem Statement

Given a list of coin denominations and a target amount, return the **minimum number of coins** needed to make up that amount. If not possible, return a message saying it is not possible.

## 💡 Approach

- ⚙️ Recursive Function Logic: `coinChange(coins, amount, dp)`

- ✅ Base Cases:

  - `amount == 0`: return 0 (no more coins needed)
  - `amount < 0`: return `INT_MAX` (invalid path)
  - `dp[amount] != -1`: return `dp[amount]` (already computed)

- 🔁 Recursive Step:

  - Loop through each coin:

    - Recursively call `coinChange(coins, amount - coin[i], dp)`
    - If result is not `INT_MAX`, update the minimum number of coins

- 🧠 Store and Return:

  - Store the result in `dp[amount]`

## 🧾 Example

```cpp
Coins = {1, 2}
Amount = 5
Output: Minimum coins needed: 3
```

---

# 3 -🧮 MaximumSumWithoutAdjacent Problem =  Elements (Recursive)

This C++ program calculates the **maximum sum of non-adjacent elements** in an array using recursion.

---

## 🧠 Problem Statement

Given an array of integers, find the **maximum sum** by **not selecting two adjacent elements**.

```cpp
Input:  arr = [1, 2, 3, 5, 4]
Output: 8
```

## 🚀 Approach

- **Include** the current element and skip the next
- **Exclude** the current element and move to the next
- Choose the maximum of both choices

## 📜 Code

```cpp
#include <iostream>
using namespace std;

void solve(vector<int> &arr, int sum, int &maxx, int i) {
    if (i >= arr.size()) {
        maxx = max(maxx, sum);
        return;
    }

    // Include current element and skip next
    solve(arr, sum + arr[i], maxx, i + 2);

    // Exclude current element
    solve(arr, sum, maxx, i + 1);
}

int main() {
    vector<int> arr{1, 2, 3, 5, 4};
    int sum = 0;
    int maxx = INT_MIN;
    int i = 0;

    solve(arr, sum, maxx, i);
    cout << maxx << endl;
    return 0;
}
```

## 🔁 Recursive Tree Diagram

```mermaid
graph TD;
    A[solve(0, sum=0)] --> B[include arr[0]=1 → solve(2, sum=1)]
    A --> C[exclude arr[0] → solve(1, sum=0)]
    B --> D[include arr[2]=3 → solve(4, sum=4)]
    B --> E[exclude arr[2] → solve(3, sum=1)]
    C --> F[include arr[1]=2 → solve(3, sum=2)]
    C --> G[exclude arr[1] → solve(2, sum=0)]
    G --> H[include arr[2]=3 → solve(4, sum=3)]
    G --> I[exclude arr[2] → solve(3, sum=0)]
```

## 🧪 Sample Output

```cpp
Input:  arr = {1, 2, 3, 5, 4}
Output: 8
```

## 📌 Note

- Time complexity is **exponential**: `O(2^n)`
- Can be optimized using **Dynamic Programming** with memoization

---

Let me know if you want:

- Dynamic programming version
- Complexity analysis
- Image version of the tree diagram
