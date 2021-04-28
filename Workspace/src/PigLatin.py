sen = 'hello world'
sen = sen.split()
ay = 'ay'
i=0
while sen [i][:1] == 'A' or sen [i][:1] == 'a' or sen [i][:1] == 'E' or sen [i][:1] == 'e' or sen [i][:1] == 'I' or sen [i][:1] == 'i' or sen [i][:1] == 'O' or sen [i][:1] == 'o' or sen [i][:1] == 'U' or sen [i][:1] == 'u':
    print sen [i]+ 'yay'
    i+=1
else:
    while i < len(sen):
        print sen [i][1:]+sen[i][:1]+ay
        i+=1
