import math


a0,a,b,L,n = 7.86,16.67,76.667,99,5

A = 0

x=int(input("Enter an positive integer:"))

for n in range(5,31):

 A += (a*math.cos((n*math.pi*x)/L)**2 + b*math.sin((n*math.pi*x)/L)**2)


 A += a0

print(A)
