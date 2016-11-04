'''
Created on Nov 5, 2016

@author: Admin
'''

from ShapeCache import *

ShapeCacheClass.load_cache()
circle = ShapeCacheClass.get_shape('circle')
circle.draw()

rectangle = ShapeCacheClass.get_shape('rectangle')
rectangle.draw()