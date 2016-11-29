'''
Created on Nov 12, 2016

@author: Admin
'''
from abc import abstractmethod
from HelpHandler import *

class WidgetClass:
    
    def __init__(self, help_handler):
        self._help_handler = help_handler

    @staticmethod    
    @abstractmethod
    def draw():
        pass
    
    @abstractmethod
    def show_help(self):
        pass
    
class PrintButton(WidgetClass):
    
    @staticmethod
    def draw():
        print('Drawing a Print Button')
        
    def show_help(self):
        self._help_handler.show_help(HelpHandlerClass.PRINT_BUTTON)
        
class SaveButton(WidgetClass):
    
    @staticmethod
    def draw():
        print('Drawing a Save Button')
        
    def show_help(self):
        self._help_handler.show_help(HelpHandlerClass.SAVE_BUTTON)
        
class GenericButton(WidgetClass):
    
    @staticmethod
    def draw():
        print('Drawing a button')
        
    def show_help(self):
        self._help_handler.show_help(HelpHandlerClass.WIDGET)