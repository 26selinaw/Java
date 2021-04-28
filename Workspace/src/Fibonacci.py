flist = [0,1]
i=0
print('Enter the length of list: ')
y= input()
while i<y:
    x = flist[-2] + flist[-1]
    flist.append (x)
    i+=1
print x