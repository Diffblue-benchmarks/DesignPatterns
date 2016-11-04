'''
Created on Nov 5, 2016

@author: Admin
'''
from Shape import *

class ShapeCacheClass:
    
    _shape_map = dict()
    
    @staticmethod
    def load_cache():
        ShapeCacheClass._shape_map['circle'] = Circle(1)
        ShapeCacheClass._shape_map['rectangle'] = Rectangle(2)
    
    @staticmethod
    def get_shape(shape_type):
        return ShapeCacheClass._shape_map[shape_type].clone()