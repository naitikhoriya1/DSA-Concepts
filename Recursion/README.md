# 🔁 Binary Search with Recursion – Key Idea

For a sorted array:

- Find the middle index mid.

- If arr[mid] == key → return mid.

- If key < arr[mid] → search in the left half.

- If key > arr[mid] → search in the right half.

- If start index > end index → return -1 (not found)


 ## 🧠 Tip:
 
Recursive binary search is elegant and clean, but iterative versions are usually more memory-efficient because recursion can consume stack space on large arrays.