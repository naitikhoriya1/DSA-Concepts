# 1 - 🔁 BinarySearch Problem = with Recursion – Key Idea

For a sorted array:

- Find the middle index `mid`.
- If `arr[mid] == key` → return `mid`.
- If `key < arr[mid]` → search in the left half.
- If `key > arr[mid]` → search in the right half.
- If `start index > end index` → return `-1` (not found).

## 🧠 Tip:

Recursive binary search is elegant and clean, but iterative versions are usually more memory-efficient because recursion can consume stack space on large arrays.

---

# 2 - 🔁 CutIntoSegment Problem = a String – Key Idea

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

# 3 - 🪙 CoinChange Problem = Recursive + Memoization (C++)

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

# 4 - 🧮 MaximumSumWithoutAdjacent Problem = Elements (Recursive)

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

# 5 - 🔍 Last Occurrence of Character in a String (Recursive C++)

## 🧠 Problem Statement

Given:

- A string `str`
- A character `ch`

Find the **last index** where `ch` appears in `str`.

---

## 📦 Example

```cpp
Input:
str = "abcddecfdg"
ch = 'd'

Output:
Found at Index : 9
```

---

## 🚀 Approach

- Start from the end of the string (index = `str.size() - 1`)
- At each step:

  - If `str[i] == ch`, store `i` as the last found index
  - Otherwise, move to the previous index (`i - 1`)

- Use a reference variable `foundAt` to store the result

---

## 🧾 Code

```cpp
#include <iostream>
using namespace std;

void solve(string &str, char ch, int &foundAt, int i) {
    if (i < 0) return;

    if (ch == str[i]) {
        foundAt = i;
        return;
    }

    solve(str, ch, foundAt, i - 1);
}

int main() {
    string str = "abcddecfdg";
    char ch = 'd';
    int foundAt = -1;

    solve(str, ch, foundAt, str.size() - 1);

    if (foundAt != -1) {
        cout << "Found at Index : " << foundAt << endl;
    } else {
        cout << "Not found : " << foundAt << endl;
    }

    return 0;
}
```

---

## 🧪 Sample Inputs & Outputs

| Input String   | Character | Output              |
| -------------- | --------- | ------------------- |
| `"abcddecfdg"` | `'d'`     | `Found at Index: 9` |
| `"abcabcabc"`  | `'b'`     | `Found at Index: 7` |
| `"xyz"`        | `'a'`     | `Not found: -1`     |
| `"aaaaa"`      | `'a'`     | `Found at Index: 4` |

---

## ⚠️ Edge Case

If the character is at index `0`, using `if (foundAt)` will fail because `0` is falsy in C++. Always use:

```cpp
if (foundAt != -1)
```

---

## 📌 Notes

- Time Complexity: O(n)
- Space Complexity: O(n) (due to recursive call stack)

# 6 - 🔁 Recursive String Reversal in C++

```markdown
This is a simple C++ program that reverses a string using a **recursive approach**. It demonstrates the use of recursion and the two-pointer technique to reverse characters in place.

## 📄 Description

The `reverse` function takes a string and recursively swaps characters from both ends moving towards the center, effectively reversing the string.

## 🧠 Concepts Used

- Recursion
- Two-pointer technique
- In-place string manipulation

## 📂 File Structure
```

reverse-string/
│
├── main.cpp // Contains the recursive string reversal logic
└── README.md // This documentation file

````

## ▶️ Usage

### 1. Compile the code:
```bash
g++ main.cpp -o reverse
````

### 2. Run the program:

```bash
./reverse
```

### ✅ Sample Output:

```
Reversed String is : dcba
```

## 🛠️ Function Explanation

```cpp
void reverse(string &str, int i, int j)
{
    if (i >= j) return;

    swap(str[i], str[j]);
    reverse(str, i + 1, j - 1);
}
```

- `i` and `j` are the indices pointing to the start and end of the string.
- Characters at positions `i` and `j` are swapped.
- The function calls itself with `i + 1` and `j - 1` until `i >= j`.

# 7 - ➕ Recursive String Addition in C++

This project demonstrates a recursive method to add two non-negative integers represented as strings. This is particularly useful when dealing with **very large numbers** that may exceed the range of built-in integer types.

---

## 📌 Features

- Pure C++ implementation
- Handles very large numbers represented as strings
- Simulates manual digit-by-digit addition
- Uses recursion to mimic backtracking logic
- No usage of in-built arithmetic data types for the result

---

## 🧠 Logic Overview

- The function `addString()` is called recursively from the least significant digit (end of strings) to the most significant.
- Each recursive call:
  - Extracts a digit from each string (or uses 0 if out of bounds)
  - Adds the digits and carry
  - Computes the result digit and updates the carry
- After all recursive calls, digits are appended in reverse order to get the final answer.

---

## 📄 Code Structure

```cpp
void addString(string &num1, int p1, string &num2, int p2, int carry, string &ans)
```

- **num1, num2**: Strings representing the numbers
- **p1, p2**: Current indices being processed
- **carry**: Carry from the previous addition
- **ans**: Result string being built (reversed)

---

## ▶️ Example

```cpp
string num1 = "123";
string num2 = "27";
```

### Output:

```
Addition Of Two Strings Is: 150
```

# 8 - 🔁 Recursive Palindrome Checker in C++

This project demonstrates how to check if a string is a palindrome using recursion in C++. A palindrome is a word, number, or phrase that reads the same backward as forward, such as `madam`, `racecar`, or `12321`.

---

## 📌 Features

- Simple and intuitive recursive approach
- Efficient O(n) time complexity
- Works for any alphanumeric strings
- Customizable for case-insensitive or filtered checks

---

## 🧠 Logic Overview

- Compare characters from both ends (`i` and `j`) of the string.
- If characters mismatch at any point, return `false`.
- Move inward (`i++`, `j--`) recursively until `i >= j`.

---

## 🧾 Function Explanation

```cpp
bool solve(string &str, int i, int j)
```

- **Parameters:**

  - `str`: Input string
  - `i`: Left pointer (starts at 0)
  - `j`: Right pointer (starts at `str.length() - 1`)

- **Returns**:

  - `true` if the string is a palindrome
  - `false` otherwise

---

## ▶️ Example

```cpp
string str = "racbecar";
```

### Output:

```
Not A Palindrome
```

---

## 🧪 Sample Input/Output

| Input       | Output           |
| ----------- | ---------------- |
| `"madam"`   | Palindrome       |
| `"racecar"` | Palindrome       |
| `"hello"`   | Not A Palindrome |
| `"level"`   | Palindrome       |

---

# 9 - 🔁 Recursive Subarray Printer in C++

This C++ program prints all **contiguous subarrays** of a given array using recursion. Instead of traditional nested loops, it uses two pointers `i` and `j` to recursively explore all subarrays.

---

## 🚀 Program Goal

Given a vector `ans = {1, 2, 3, 4, 5}`, the program prints all contiguous subarrays like:

```

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
2
2 3
2 3 4
2 3 4 5
3
3 4
3 4 5
4
4 5
5

```

---

## 🧠 Recursive Logic Overview

We use a recursive function `solve(ans, i, j)`:

- `i`: start index of current subarray
- `j`: end index of current subarray

### 🔄 Logic Flow:

1. Print subarray from `i` to `j`
2. Increase `j` to expand current subarray
3. If `j` goes out of bounds, reset `j = i + 1` and increase `i`

---

## 🌳 Recursion Tree (Conceptual View)

```

solve(0,0)
├── print \[1]
└── solve(0,1)
├── print \[1 2]
└── solve(0,2)
├── print \[1 2 3]
└── solve(0,3)
├── print \[1 2 3 4]
└── solve(0,4)
├── print \[1 2 3 4 5]
└── solve(0,5) ❌ out of bounds
└── solve(1,1)
├── print \[2]
└── solve(1,2)
├── print \[2 3]
...

```

> This recursion tree shows how the function expands `j` (subarray length) until out of bounds, then shifts `i` and resets `j`.

---

## 📈 Graphical Flow (Pointer Movement)

```

i = 0
j → \[1] \[2] \[3] \[4] \[5]
↑---↑ expand j
i = 1
j → \[2] \[3] \[4] \[5]
↑---↑ expand j
i = 2
j → \[3] \[4] \[5]
↑---↑ expand j
...

```

> At every level, `i` stays fixed while `j` increases. When `j` goes out of bounds, `i` is incremented and `j = i`.

---

## 💡 Dry Run (Sample Execution)

### Input:

```cpp
vector<int> ans{1, 2, 3};
```

### Output:

```
1
1 2
1 2 3
2
2 3
3
```

---

## 🛠️ Code Explanation

```cpp
void solve(vector<int> &ans, int i, int j)
{
    if (i >= ans.size()) return;         // base case
    if (j >= ans.size()) {
        solve(ans, i + 1, i + 1);        // move to next row
        return;
    }

    for (int k = i; k <= j; k++)         // print subarray
        cout << ans[k] << " ";
    cout << endl;

    solve(ans, i, j + 1);                // expand j
}
```

---

## 🧪 How to Run

### 1. Compile

```bash
g++ main.cpp -o subarray
```

### 2. Execute

```bash
./subarray
```

---

## 📂 File Structure

```
recursive-subarray/
├── main.cpp       # Main program logic
└── README.md      # Documentation
```

---

## 📊 Time Complexity

- The total number of subarrays is **n(n+1)/2**
- Each subarray takes up to O(n) to print
- So overall time complexity is **O(n³)** in worst-case printing

---
