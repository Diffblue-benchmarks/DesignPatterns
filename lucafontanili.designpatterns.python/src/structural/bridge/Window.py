'''
Created on Nov 5, 2016

@author: Admin
'''
class WindowClass:
    
    def create_window(self):
        pass
    
class UbuntuWindow(WindowClass):
    
    def create_window(self):
        print('Creating an Ubuntu window')
        
class MacOSXWindow(WindowClass):
    
    def create_window(self):
        print('Creating an MacOSX window')