# -*- coding: utf-8 -*-
'''
Created on Nov 5, 2016

@author: Admin
'''
from Worker import *
import random

employee = Employee('Luca Fontanili', 'Red Room', 'Software Engineer')
employee.set_salary(random.randint(0,100))
print("Luca's salary: " + str(employee.salary()) + "k€")

office = Office('Cool Office')
employee1 = Employee('Legolas', office.name(), 'HR Specialist')
employee1.set_salary(30)

employee2 = Employee('Gimli', office.name(), 'Digital Marketer')
employee2.set_salary(35)
office.add(employee1)
office.add(employee2)

print(office.name() + "'s salary: " + str(office.salary()) + 'k€')