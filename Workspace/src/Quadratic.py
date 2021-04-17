a = 4
b = 6
c = -4
x1 = (-b - ((b*b-4*a*c) ** 0.5) )/2*a
x2 = (-b + ((b*b-(4*a*c)) ** 0.5) )/2*a
f1 = -x1
f2 = -x2

print 'Equation:', a,'x^2+',b,'x=',c
print 'x=', x1, 'and', x2
print '( x +',f1,')( x +',f2,')'