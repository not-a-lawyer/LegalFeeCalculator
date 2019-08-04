from datetime import date


# Asking seperately for the time fields
year = input ("Please enter a year:\n") 
month = input ('Please enter a month e.g. "08" for august:\n') 
day = input ('Please enter a day:\n') 

deadlineYears = input ('What is your deadline in years:\n')

#Put time fields into date object. Strings need to be parsed as Integers, hence int()
inputDate = date(int(year), int(month), int(day))

deadlineDate = date(int(year) + int(deadlineYears), int(month), int(day))


print("Your entered date is\n", inputDate)   

print("Your deadline is\n", deadlineDate)                