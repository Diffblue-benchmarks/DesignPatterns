'''
Created on Nov 6, 2016

@author: Admin
'''

from View import *

simple_view = ImageView()
simple_view.draw()

decorated_view = BorderDecorator(TextView())
decorated_view.draw()