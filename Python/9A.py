class Person:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
    def display_info(self):
        print("My name is", self.name)
        print("My age is", self.age)
        print("My gender is", self.gender)
obj = Person("Rashi", 19, "Female")
obj.display_info()
