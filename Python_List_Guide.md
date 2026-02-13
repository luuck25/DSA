
# 🐍 Python List – Complete Guide

A quick reference for creating, accessing, modifying, and performing operations on Python lists.

---

# 📌 1️⃣ Creating Lists

## 🔹 Using Square Brackets

```python
a = [1, 2, 3]
empty_list = []
```

---

## 🔹 Using `list()` Constructor

```python
list_from_tuple = list((1, 2, 3))
list_from_string = list("hello")
list_from_range = list(range(5))
```

---

## 🔹 From Another List (Copying)

```python
lst_copy1 = a.copy()
lst_copy2 = a[:]
lst_copy3 = list(a)
```

---

## 🔹 From Set

```python
list_from_set = list({1, 2, 3})
```

---

## 🔹 From Dictionary

```python
sample_dict = {"a": 1, "b": 2}

list_keys = list(sample_dict.keys())
list_values = list(sample_dict.values())
list_items = list(sample_dict.items())
```

---

# 📌 2️⃣ Accessing Elements

```python
list_a = [1, 2, 3]

print(list_a[0])     # First element
print(list_a[-1])    # Last element
```

---

# 📌 3️⃣ Traversing a List

## 🔹 Using Direct Loop

```python
for num in list_a:
    print(num)
```

## 🔹 Using Index

```python
for i in range(len(list_a)):
    print(list_a[i])
```

---

# 📌 4️⃣ Slicing

```python
print(list_a[0:2])
print(list_a[:2])
print(list_a[1:])
```

---

# 📌 5️⃣ Modifying Lists

## ➕ Adding Elements

```python
list_a.append(4)
list_a.insert(1, 5)
list_a.extend([6, 7])
```

---

## ➖ Removing Elements

```python
list_a.remove(4)
list_a.pop()
list_a.pop(1)
del list_a[0]
del list_a[1:3]
list_a.clear()
```

---

# 📌 6️⃣ Searching in List

```python
list_a.index(5)
list_a.count(5)
5 in list_a
```

---

# 📌 7️⃣ Sorting & Reversing

```python
lst = [3, 1, 2]

lst.sort()
lst.sort(reverse=True)
new_lst = sorted(lst)
lst.reverse()
```

---

# 📌 8️⃣ Other Useful Operations

```python
len(lst)
max(lst)
min(lst)
sum(lst)
```

---

# 📌 9️⃣ Performance Notes

| Operation | Time Complexity |
|------------|----------------|
| Access by index | O(1) |
| Append | O(1) (amortized) |
| Insert at beginning | O(n) |
| Remove/Search | O(n) |
| Sort | O(n log n) |

---

# ✅ Key Properties of Python Lists

- Ordered
- Mutable
- Allows duplicates
- Dynamic size
- Indexed
- Supports slicing

---

# 🚀 Quick Example

```python
numbers = [1, 2, 3]

numbers.append(4)
numbers.insert(1, 10)
numbers.remove(2)

print(numbers)
```

---

# 📚 Summary

Python lists are flexible, dynamic, and powerful data structures used to store ordered collections of items.
