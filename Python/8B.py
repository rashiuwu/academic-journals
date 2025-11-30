with open("py.txt","w") as f:
    f.write("x, a, r, w, r+, w+, a+, rb, rb+, wb, wb+, ab, ab+ \n This is a Second line")
print("Reading each line:")
with open("py.txt", "r") as f:
    for line in f:
        print(line.strip())
with open("py.txt", "r") as f:
    content=f.read()
    words=content.split()
    print("\nSplitting File Content")
    print(words)
