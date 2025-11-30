import random

arr = [random.randint(0, 30) for _ in range(10)]
print("Unsorted array:", arr)

arr.sort()
print("Sorted array:", arr)
