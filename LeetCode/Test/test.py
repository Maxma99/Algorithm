"""
n = int(input())
arr = []
f = [-2,3,-2,1]
ttt = [-2,3,-1]
fff = [-3,2,-1,3,-1]
if n==2:
    print("No Answer")
else:
    for jff in range(n//4):
        arr.append(f)
    if n % 4 == 1:
        arr[-1]=fff
    if n % 4 == 2:
        arr[-2] = fff
        fff=[-x for x in fff]
        arr[-1] = fff
    if n % 4 == 3:
        arr.append(ttt)
    res = [item for sub in arr for item in sub]
    print("".join(str(res)[1:-1].replace(","," ")))
"""
