with open("py.txt", "w") as f:
    f.write("x, a, r, w, r+, w+, a+, rb, rb+, wb, wb+, ab, ab+")
with open("py.txt", "a") as f:
    f.write("\nAppending some text.")
with open("py.txt", "r") as f:
    print("\nFile content (R mode)")
    print(f.read())
with open("py.txt", "r+") as f:
    f.write("\nAdded using R+ mode")
    f.seek(0)
    print("\nFile content (R+ mode)")
    print(f.read())
with open("py.txt", "a+") as f:
    f.write("\nAppending with A+ mode")
    f.seek(0)
    print("\nFile content (A+ mode)")
    print(f.read())
