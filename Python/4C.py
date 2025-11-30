def armst(n):
 return n==sum(int(digit)**3 for digit in str(n))
n=int(input("Enter a number: "))
print(armst(n))
