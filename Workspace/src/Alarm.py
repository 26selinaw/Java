import datetime 
def time ():
    time = datetime.datetime.now()
    if time.hour > 10:
        print '0'+ str(time.hour - 12) + ':'+ str(time.minute)+':'+ str(time.second)
    elif time.minute < 10:
        print str(time.hour) + ':0'+ str(time.minute)+':'+ str(time.second)
    elif time.second < 10:
        print str(time.hour) + ':' + str(time.minute)+':0'+  str(time.second)
    else:
        print str (time.hour)+ ':'+ str(time.minute)+':'+ str(time.second)
def date():
    time = datetime.datetime.now() 
    if time.month > 0:
        print '0' + str(time.month) + '/'+ str(time.day)+'/'+str(time.year)
    elif time.day > 0:
        print str(time.month) + '/0'+ str(time.day)+'/'+str(time.year)
    else:
        print str(time.month) + '/'+ str(time.day)+'/'+str(time.year)
time ()
date ()