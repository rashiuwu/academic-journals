class Person:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
 
    def display_info(self):
        print("My name is", self.name)
        print("My age is", self.age)
        print("My gender is", self.gender)
 
class Student(Person):
    def __init__(self, name, age, gender, fname, lname):
        super().__init__(name, age, gender)
        self.fname = fname
        self.lname = lname
 
    def display_student_info(self):
        self.display_info()
        print("My First name is", self.fname)
        print("My Last name is", self.lname)
 
obj = Student("Rashi", 19, "Female", "Rashi", "Sawardekar")
 
obj.display_student_info()
