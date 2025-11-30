import re
class Student:
    def __init__(self, fname, lname, graduation_year=2023):
        self.fname = fname
        self.lname = lname
        self.graduation_year = str(graduation_year)
    def check_name(self):
        if re.search(r"a",self.fname,re.IGNORECASE) or re.search(r"a",self.lname,re.IGNORECASE):
            print("The name contains the letter 'a'")
        else:
            print("The name does not contain the letter 'a'")
    def check_num(self):
        if re.findall(r"0",self.graduation_year):
            print("The graduation year contains the digit '0'")
        else:
            print("The graduation year does not contain the digit '0'")
    def welcome(self):
        print("Welcome", self.fname, self.lname, "to the class of", self.graduation_year)
 
student1=Student("Rashi","Sawardekar")
student1.welcome()
student1.check_name()
student1.check_num()
