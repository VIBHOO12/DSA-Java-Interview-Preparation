# Day 02 — Array Patterns

## Topics

* Frequency / Counting
* Prefix Sum
* Range Sum
* Subarray
* Subarray Sum

## Problems Solved

1. Find frequency of an element
2. Build prefix sum array
3. Find range sum
4. Count positive and negative numbers
5. Find subarray with given sum

## Key Concepts

### Frequency

Counts how many times an element occurs.

**Time:** O(n) | **Space:** O(1)

### Prefix Sum

Stores cumulative sums.

```text
Array:  [1, 2, 3, 4, 5]
Prefix: [1, 3, 6, 10, 15]
```

Formula:

```text
prefix[i] = prefix[i-1] + arr[i]
```

### Range Sum

```text
sum(L,R) = prefix[R] - prefix[L-1]
```

### Subarray

A continuous part of an array.

Example:

```text
[1, 2, 3] → [2, 3] ✓
[1, 3]     → ✗
```

## Complexity

| Problem      | Time  | Space |
| ------------ | ----- | ----- |
| Frequency    | O(n)  | O(1)  |
| Prefix Sum   | O(n)  | O(n)  |
| Range Sum    | O(1)* | O(n)  |
| Subarray Sum | O(n²) | O(1)  |

`*` After prefix-sum preprocessing.

## Interview Keywords

* **Frequency** → Counting
* **Range Sum** → Prefix Sum
* **Continuous** → Subarray
* **Maximum Subarray** → Kadane's Algorithm

## Progress

* [x] Day 01 — Arrays Basics
* [x] Day 02 — Array Patterns
* [ ] Day 03 — Strings
* [ ] Day 04 — Two Pointers
* [ ] Day 05 — Sliding Window
