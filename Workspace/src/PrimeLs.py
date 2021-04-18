print 'Enter the minimum: '
x = input()
print('Enter the maximum: ')
y = input()
primelist = []
if x <= 2:
    primelist.append (2)
while x<=y: 
    i=2
    while i < x:
        if x % i == 0:
            break
        if (i==x-1):
            primelist.append(x)
        i=i+1
    x=x+1
for s in primelist:
    print s
print 'The length of the list is ', len(primelist)
