n=int(input())
for i in range(1,n+1):
    count=0
    for j in range(0,i):
        count=count+1
        print(count,end="")
    print()