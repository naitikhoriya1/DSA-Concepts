# 🔁 Binary Search with Recursion – Key Idea

For a sorted array:

- Find the middle index mid.

- If arr[mid] == key → return mid.

- If key < arr[mid] → search in the left half.

- If key > arr[mid] → search in the right half.

- If start index > end index → return -1 (not found)

## 🧠 Tip:

Recursive binary search is elegant and clean, but iterative versions are usually more memory-efficient because recursion can consume stack space on large arrays.

# 🔁 Subsequences of a String – Key Idea

🧠 Goal:

- Print all subsequences of "abc"
- A string of length n has 2^n subsequences. For "abc", that's 8.

🔁 Recursive Decision Tree

- Each character has two choices:
- ✅ include it in out
- ❌ exclude it from out

## Visualized as a binary tree:

                           "" (i=0)
                        /           \
                   ""                "a"
               /       \           /      \
           ""           "b"     "a"        "ab"
         /    \       /    \   /    \     /     \
      ""     "c"   "b"   "bc" "a"  "ac"  "ab"   "abc"

(i=3) (base)...

## 🧱 Execution Steps

Let’s walk through the calls:

subSequences("abc", "", 0)
├─ Exclude 'a': subSequences("abc", "", 1)
│ ├─ Exclude 'b': subSequences("abc", "", 2)
│ │ ├─ Exclude 'c': subSequences("abc", "", 3) → prints ""
│ │ └─ Include 'c': subSequences("abc", "c", 3) → prints "c"
│ └─ Include 'b': subSequences("abc", "b", 2)
│ ├─ Exclude 'c': subSequences("abc", "b", 3) → prints "b"
│ └─ Include 'c': subSequences("abc", "bc", 3) → prints "bc"
└─ Include 'a': subSequences("abc", "a", 1)
├─ Exclude 'b': subSequences("abc", "a", 2)
│ ├─ Exclude 'c': subSequences("abc", "a", 3) → prints "a"
│ └─ Include 'c': subSequences("abc", "ac", 3) → prints "ac"
└─ Include 'b': subSequences("abc", "ab", 2)
├─ Exclude 'c': subSequences("abc", "ab", 3) → prints "ab"
└─ Include 'c': subSequences("abc", "abc", 3) → prints "abc"

## ✅ Final Output

(empty line)

- c
- b
- bc
- a
- ac
- ab
- abc

🧠 Tip:
Subsequences are a fundamental concept in combinatorics and have applications in various fields like computer science, cryptography, and bioinformatics.

---

---

# 🪙 Coin Change Problem - Recursive + Memoization (C++)

This project solves the **Coin Change** problem using a **top-down dynamic programming** (memoization) approach in C++. The goal is to find the **minimum number of coins** needed to make up a specific amount using a given set of coin denominations.

---

## 🧠 Problem Statement

Given a list of coin denominations and a target amount, return the **minimum number of coins** that you need to make up that amount. If it is not possible to make up that amount, return a message saying it is not possible.

---

## 💡 Approach

- ⚙️ Recursive Function Logic: coinChange(coins, amount, dp)
- ✅ Base Cases:

  - If amount == 0: return 0 (no more coins needed).

  - If amount < 0: return INT_MAX (invalid path).

  - If dp[amount] != -1: return dp[amount] (already computed).

- 🔁 Recursive Step:

  - Loop through each coin:

    - Recursively call coinChange(coins, amount - coin[i], dp)

    - If result is not INT_MAX, update the minimum number of coins.

- 🧠 Store and Return:

  - Store the minimum number of coins in dp[amount]

- Return dp[amount]

## 🧾 Example

Input:

````cpp
Coins = {1, 2}
Amount = 5

Output:

```cpp
Minimum coins needed: 3
````

---

# maximum sum of non-adjacent elements 🤪

Here's a clean and organized `README.md` for your recursive solution to find the **maximum sum of non-adjacent elements**:

---

# 🧮 Maximum Sum of Non-Adjacent Elements (Recursive)

This C++ program calculates the **maximum sum of non-adjacent elements** in an array using a **recursive approach**. At every step, the program chooses whether to include the current element (and skip the next) or skip the current element entirely, and then computes the maximum possible sum.

---

## 🧠 Problem Statement

Given an array of integers, find the **maximum sum** you can get by **not selecting two adjacent elements**.

For example:

```
Input:  arr = [1, 2, 3, 5, 4]
Output: 8
```

You can choose elements like `1 + 3 + 4 = 8` or `2 + 5 = 7`.
The maximum is `8`.

---

## 🚀 Approach

This is solved using a **recursive function**:

- **Include** the current element and skip the next.
- **Exclude** the current element and move to the next.

At each step, we compare the result of both choices and keep the maximum.

---

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

---

## 🔁 Recursive Tree Diagram

For a small array like `{1, 2, 3}` the recursive calls would look like:

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

---

## 🧪 Sample Output

```
Input:  arr = {1, 2, 3, 5, 4}
Output: 8
```

---

## 📌 Note

- Time complexity is **exponential**: `O(2^n)` due to recursive branching.
- This can be optimized using **Dynamic Programming** with memoization or tabulation.

---

Let me know if you want me to add:

- A dynamic programming version
- Complexity analysis
- Or an image version of the tree diagram
