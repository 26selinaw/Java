def areaOfTriangle(base, height):
    return (base * height) / 2

base = float(input('Please Enter the Base of a Triangle: '))
height = float(input('Please Enter the Height of a Triangle: '))

area = areaOfTriangle(base, height)
print("The Area of a Triangle using", base, "and", height, " = ", area)