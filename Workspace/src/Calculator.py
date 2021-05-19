from fractions import Fraction
# Find what function user wants to use
print '1 - Finding x Given Quadratic Equation'
print '2 - Finding Equation Given 2 Points'
print '3 - Finding Point of Intersection Given Equation'
print '4 - Finding Area of Triangle'

# Finding x Given Quadratic Equation
def Quadratic ():
    a = input('Enter a in equation ax^2+bx=c: ')
    b = input('Enter b in equation ax^2+bx=c: ')
    c = input('Enter c in equation ax^2+bx=c: ')
    x1 = (-b - ((b*b-4*a*c) ** 0.5) )/2*a
    x2 = (-b + ((b*b-(4*a*c)) ** 0.5) )/2*a
    f1 = -x1
    f2 = -x2

    if a>=1 or a <= -1:
        print 'Equation:', a,'x^2+', b,'x=',c
        print 'x=',x1, 'and', x2
        print '( x +',f1,')( x +',f2,') = 0'
    if a==0:
        print 'This is not a Quadratic Equation.'

# Finding Equation Given 2 Points
def EquationOfPoints():
    i = 0
    i+=1
    print 'Enter point 1 x-coordinate: '
    x1 = input()
    i+=1
    print 'Enter point 1 y-coordinate: '
    y1 = input()

    i+=1
    print 'Enter point 2 x-coordinate: '
    x2 = input()
    i+=1
    print 'Enter point 2 y-coordinate: '
    y2 = input()
       
    m = (y1-y2)/(x1-x2)
    b = (x1*y2-y1*x2)/(x1-x2)
    print 'point 1: (' + str(x1) + ',' + str(y1) + ')' 
    print 'point 2:(' + str(x2) + ',' + str(y2) + ')' 
    print 'Equation: y = ' + str(m) + 'x + ' + str(b)

# Finding Point of Intersection Given Equation
def IntersectionOfEquation ():
    print 'Enter a in ax+by=c: '
    a1 = input()
    print 'Enter b in ax+by=c: '
    b1 = input() 
    print 'Enter c in ax+by=c: '
    c1 = input()
    print 'Enter a2 in a2x+b2y=c2: '
    a2 = input()
    print 'Enter b2 in a2x+b2y=c2: '
    b2 = input()
    print 'Enter c2 in a2x+b2y=c2: '
    c2 = input()
    y =((c1*a2)-(c2*a1))/((b1*a2)-(b2*a1))
    x =((c1*b2)-(c2*b1))/((a1*b2)-(a2*b1))
    print 'Equation 1: '+ str(int(a1)) + 'x +' + str(b1) + 'y = ' + str(c1) 
    print 'Equation 2: ' + str(a2) + 'x +'+ str(b2) + 'y = ' + str(c2)
    print 'x = ' + str(x)
    print 'y = ' + str(y)
    
# Finding Area of Triangle
def AreaOfTri ():
    base = float(input('Please Enter Base: '))
    height = float(input('Please Enter Height: '))
    area = (base*height) /2
    print area

# What Function
choice = input ('Type the Number of the Function You Want to Use: ')
if str (choice) == '1':
    Quadratic ()
elif str (choice) == '2':
    EquationOfPoints ()
elif str (choice) == '3':
    IntersectionOfEquation ()
elif str (choice) == '4':
    AreaOfTri ()
else:
    print 'Not a Usable Function'

    