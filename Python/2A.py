import random
num = random.randint(1, 100)
print(f"Random number: {num}")
if num % 2 == 0:
    print(f"{num} is an even number.")
else:
    print(f"{num} is not an even number.")
if num % 4 == 0:
    print(f"{num} is a multiple of 4.")
else:
    print(f"{num} is not a multiple of 4.")
if num > 50:
    print(f"{num} is greater than 50.")
else:
    print(f"{num} is not greater than 50.")
