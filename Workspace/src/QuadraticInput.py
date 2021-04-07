a = input('Enter a:')
b = input('Enter b:')
c = input('Enter c:')
x1 = (-b - ((b*b-4*a*c) ** 0.5) )/2*a
x2 = (-b + ((b*b-(4*a*c)) ** 0.5) )/2*a
f1 = -x1
f2 = -x2
if a==1 or a == -1:
    print 'Equation:', a,'x^2+', b,'x=',c
    print 'x=',x1, 'and', x2
    print '( x +',f1,')( x +',f2,')'
if a==0:
    print 'This is not a Quadratic Equation.'
if a < -1:
    pass
