'''
Created on Nov 3, 2016

@author: Admin
'''

from WidgetFactory import *

def create_window(factory):
    window = factory.make_diagram(30, 7)
    return window

ms_window = create_window(MSWindowWidgetFactory())  
macOSX_window = create_window(MacOSXWindowWidgetFactory())  