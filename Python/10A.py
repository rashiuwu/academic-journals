class Student:
    def __init__(self, fname, lname, graduation_year=2023):
        self.fname = fname
        self.lname = lname
        self.graduation_year = graduation_year
   
    def welcome(self):
        print("Welcome", self.fname, self.lname, "to the class of", self.graduation_year)
 
student1 = Student("Rashi", "Sawardekar")
student1.welcome()
