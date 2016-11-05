'''
Created on Nov 5, 2016

@author: Admin
'''

from Window import *

class WindowEditorClass:
    
    _window = None

    def make_window(self):
        self._window.create_window()
        
    @staticmethod
    def get_editor(window_type):
        if window_type == 'Mac OS':
            return MacOSXWindowEditor()
        elif window_type == 'Ubuntu':
            return UbuntuWindowEditor()

class MacOSXWindowEditor(WindowEditorClass):
    
    def __init__(self):
        self._window = MacOSXWindow()

class UbuntuWindowEditor(WindowEditorClass):
    
    def __init__(self):
        self._window = UbuntuWindow()