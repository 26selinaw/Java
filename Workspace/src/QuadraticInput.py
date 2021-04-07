a = input('Enter a:')
b = input('Enter b:')
c = input('Enter c:')
x1 = (-b - ((b*b-4*a*c) ** 0.5) )/2*a
x2 = (-b + ((b*b-(4*a*c)) ** 0.5) )/2*a

print 'Equation:', a,'x^2+', b,'x=',c
print 'x=',x1, 'and', x2