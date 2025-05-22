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

- subSequences("abc", "", 0)
- ├─ Exclude 'a': subSequences("abc", "", 1)
- │ ├─ Exclude 'b': subSequences("abc", "", 2)
- │ │ ├─ Exclude 'c': subSequences("abc", "", 3) → prints ""
- │ │ └─ Include 'c': subSequences("abc", "c", 3) → prints "c"
- │ └─ Include 'b': subSequences("abc", "b", 2)
- │ ├─ Exclude 'c': subSequences("abc", "b", 3) → prints "b"
- │ └─ Include 'c': subSequences("abc", "bc", 3) → prints "bc"
- └─ Include 'a': subSequences("abc", "a", 1)
- ├─ Exclude 'b': subSequences("abc", "a", 2)
- │ ├─ Exclude 'c': subSequences("abc", "a", 3) → prints "a"
- │ └─ Include 'c': subSequences("abc", "ac", 3) → prints "ac"
- └─ Include 'b': subSequences("abc", "ab", 2)
- ├─ Exclude 'c': subSequences("abc", "ab", 3) → prints "ab"
- └─ Include 'c': subSequences("abc", "abc", 3) → prints "abc"

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
