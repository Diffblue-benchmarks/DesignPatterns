'''
Created on Nov 5, 2016

@author: Admin
'''
class WindowClass:
    
    @staticmethod
    def create_window():
        pass
    
class UbuntuWindow(WindowClass):
    
    @staticmethod
    def create_window():
        print('Creating an Ubuntu window')
        
class MacOSXWindow(WindowClass):
    
    @staticmethod
    def create_window():
        print('Creating an MacOSX window')