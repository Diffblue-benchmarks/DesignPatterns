'''
Created on Nov 3, 2016

@author: Admin

'''
from Window import *
class MSWindowWidgetFactory:

    def make_diagram(self, width, height):
        return MSWindow()
    

class MacOSXWindowWidgetFactory:

    def make_diagram(self, width, height):
        return MacOSXWindow()

   