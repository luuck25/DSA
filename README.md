Python List Cheat Sheet

A quick reference guide for creating, accessing, modifying, and performing operations on Python lists.

📌 1️⃣ Creating Lists
🔹 Using Square Brackets
a = [1, 2, 3]

🔹 Using list() Constructor
ab = list((1, 2, 3))       # From tuple
lst = list('hello')        # From string
lst1 = list(range(5))      # From range

🔹 From Another List (Copying)
lst = ab.copy()
lst = ab[:]
lst = list(ab)

🔹 From Set
list_set = list({1, 2, 3})

🔹 From Dictionary
sample_dict = {"a": 1, "b": 2}

listkeys = list(sample_dict.keys())
listvalues = list(sample_dict.values())

Get Both Key and Value
lst = list(sample_dict.items())
print(lst)


Output:

[('a', 1), ('b', 2)]


Each element is a tuple.

📌 2️⃣ Accessing List Elements
list_a = [1, 2, 3]

print(list_a[0])     # First element
print(list_a[-1])    # Last element

📌 3️⃣ Traversing a List
🔹 Direct Loop
for num in list_a:
    print(num)

🔹 Using Index
for i in range(len(list_a)):
    print(list_a[i])

📌 4️⃣ Slicing
print(list_a[0:2])

📌 5️⃣ Modifying Lists
➕ Adding Elements
list_a.append(4)        # Add at end
list_a.insert(1, 5)     # Insert at index

➖ Removing Elements
list_a.remove(4)        # Remove by value (first occurrence)
list_a.pop()            # Remove last element
list_a.pop(1)           # Remove by index
del list_a[0]           # Delete by index
del list_a[1:3]         # Delete slice
list_a.clear()          # Remove all elements

📌 6️⃣ Searching
list_a.index(5)     # Get index of element
list_a.count(5)     # Count occurrences

📌 7️⃣ Sorting & Reversing
lst.sort()                    # Sort ascending (in-place)
lst.sort(reverse=True)        # Sort descending
new_lst = sorted(lst)         # Returns new sorted list
lst.reverse()                 # Reverse list

📌 8️⃣ Other Useful Operations
len(lst)      # Length of list
max(lst)      # Maximum value
min(lst)      # Minimum value
sum(lst)      # Sum of elements
