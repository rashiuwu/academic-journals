import random

limit = random.randint(1, 50)
result = sum(i**2 for i in range(1, limit + 1))

print("Limit:", limit)
print("Sum of squares:", result)
