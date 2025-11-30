print("Pattern a:")
for i in range(1, 7):
    for j in range(i):
        print(i, end=" ")
print()

print("Pattern b:")
for i in range(1, 7):
    for j in range(6 - i + 1):
        print(i, end=" ")
print()

print("Pattern c:")
for i in range(1, 7):
    for j in range(1, i + 1):
        print(j, end=" ")
print()
