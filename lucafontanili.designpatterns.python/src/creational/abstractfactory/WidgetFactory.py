'''
Created on Nov 3, 2016

@author: Admin

'''
from Window import *
class MSWindowWidgetFactory:

    @staticmethod
    def make_diagram(width, height):
        return MSWindow()
    

class MacOSXWindowWidgetFactory:

    @staticmethod
    def make_diagram(width, height):
        return MacOSXWindow()

   