
# Python3 code to iterate over a list
list = [1, 5, 3, 9, 12, 2, 7, 4, 8, 10, 6, 11]
  
# Getting length of list
length = len(list)
i = 0
  
# Iterating using while loop
while i < length:
    i+=1
    x1 = list[i-1]
    i+=1
    y1 = list[i-1]
    
    i+=1
    x2 = list[i-1]
    i+=1
    y2 = list[i-1]
    
    m = (y1-y2)/(x1-x2)
    b = (x1*y2-y1*x2)/(x1-x2)
    print ('point 1: (',x1,',',y1,') point 2:(',x2,',',y2,') Equation: y =',m, 'x +', b)
