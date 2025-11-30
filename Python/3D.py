count = 0
for i in range(1, 11):
    for j in range(1, 11):
        print(j)
        count += 1
print("Total executions:", count)

count = 0
for i in range(1, 11):
    for j in range(1, i + 1):
        print(j)
        count += 1
print("Total executions:", count)

count = 0
for i in range(1, 6):
    for j in range(10, i, -1):
        print(j)
        count += 1
print("Total executions:", count)
