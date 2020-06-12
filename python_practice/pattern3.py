n=int(input())
for i in range(0,n):
    for j in range(1,n-i): #for space
        print(" ",end="")
    for j in range(0,i+1): #for *
        print("*", end="")
    print()