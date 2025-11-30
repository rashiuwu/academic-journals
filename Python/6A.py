import random

myArray = [random.randint(0, 10) for _ in range(8)]

print("Array elements:", myArray)
print("Total sum:", sum(myArray))
print("Count greater than 5:", sum(1 for x in myArray if x > 5))
print("Maximum value:", max(myArray))
