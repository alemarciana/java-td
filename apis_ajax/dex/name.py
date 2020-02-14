import os
arr = []
for i in os.listdir():
    print(i)
    if "Pokémon" in i:
        arr.append(i)
cont=0
for x in arr:
    print(x)
    w = (x.split(' - ')[1]).split(' (')[0]
    os.rename(x,w+'.m4a')
    arr[cont] = w
    cont=cont+1
print(arr)
