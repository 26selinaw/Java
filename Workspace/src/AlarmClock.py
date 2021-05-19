øimport datetime 

def time ():
    time = datetime.datetime.now() 
    if time.hour < 10:
        print '0' + str (time.hour)+ ':', str(time.minute)+':'+ str(time.second)
    elif time.minute < 10:
        print str (time.hour)+ ':0'+ str(time.minute)+':'+ str(time.second)
    elif time.second < 10:
        print str (time.hour)+ ':'+ str(time.minute)+':0'+ str(time.second)
    else:
        print str (time.hour)+ ':'+ str(time.minute)+':'+ str(time.second)
def date():
    time = datetime.datetime.now() 
    print str(time.month) + '/'+ str(time.day)+'/'+str(time.year)

time ()
date ()