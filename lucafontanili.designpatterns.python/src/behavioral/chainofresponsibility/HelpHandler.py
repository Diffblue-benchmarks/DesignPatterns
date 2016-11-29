'''
Created on Nov 12, 2016

@author: Admin
'''
from abc import abstractmethod


class HelpHandlerClass:
    
    PRINT_BUTTON = 0
    SAVE_BUTTON = 1
    WIDGET = 2
    
    def __init__(self, next_handler, topics):
        self._next_handler = next_handler
        self._topics = topics
        
    @abstractmethod
    def show_help_message(self):
        pass
    
    def show_help(self, topic):
        if topic in self._topics:
            self.show_help_message()
        else:
            self._next_handler.show_help(topic)
        
class ApplicationHelpHandler(HelpHandlerClass):
    
    @staticmethod
    def show_help_message():
        print("Application's general help message")
        
class ButtonHelpHandler(HelpHandlerClass):
    
    @staticmethod
    def show_help_message():
        print('This is a button')
        
class PrintButtonHelpHandler(HelpHandlerClass):
    
    @staticmethod
    def show_help_message():
        print('This is a print button, hit it if you want to print your document')
    