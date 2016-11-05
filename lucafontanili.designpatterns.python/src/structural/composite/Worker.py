'''
Created on Nov 5, 2016

@author: Admin
'''
class EmployeeClass(object):
    
    _name = None
    _salary = None
    
    def __init__(self, name):
        self._name = name
        
    def set_salary(self, salary):
        self._salary = salary
        
    def name(self):
        return self._name
    
    def salary(self):
        return self._salary
    
class Employee(EmployeeClass):
    
    _role = None
    _office = None
    
    def __init__(self, name, office, role):
        super(Employee, self).__init__(name)
        self._role = role
        self._office = office
        
class Office(EmployeeClass):
    
    _people = []
    
    def __init__(self, name):
        super(Office, self).__init__(name)
        
    def add(self, worker):
        self._people.append(worker)
        
    def remove(self, worker):
        self._people.remove(worker)
        
    def salary(self):
        return sum(person.salary() for person in self._people)