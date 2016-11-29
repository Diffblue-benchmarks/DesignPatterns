'''
Created on Nov 5, 2016

@author: Admin
'''

import copy

class ShapeClass:
    
    _id = None
    
    @staticmethod
    def draw():
        pass
    
    def clone(self):
        pass
    
    def get_id(self):
        return self._id
    
    
class Circle(ShapeClass):
    
    def __init__(self, id):
        self._id = id
        
    @staticmethod
    def draw():
        print('Drawing a Cricle')
    
    def clone(self):
        return copy.copy(self)
    
class Rectangle(ShapeClass):
    
    
    def __init__(self, id):
        self._id = id
        
    @staticmethod
    def draw():
        print('Drawing a Rectangle')
    
    def clone(self):
        return copy.copy(self)