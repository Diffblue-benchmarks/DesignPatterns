'''
Created on Nov 5, 2016

@author: Admin
'''
class WindowClass:
    
    @classmethod
    def create_window():
        pass
    
class UbuntuWindow(WindowClass):
    
    @classmethod
    def create_window(self):
        print('Creating an Ubuntu window')
        
class MacOSXWindow(WindowClass):
    
    @classmethod
    def create_window(self):
        print('Creating an MacOSX window')