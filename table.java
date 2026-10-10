print("                  Multiplication table   ")
print("               1  2  3  4  5  6  7  8  9  ")
print("-----------------------------------------")


for number in range(1,10):
    print(f"{number} |", end="")
    for count in range(1,10):
        print(f"{number *count }", end="")
        print()
