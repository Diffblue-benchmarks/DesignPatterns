'''
Created on Nov 5, 2016

@author: Admin
'''

from WindowEditor import *

mac_window_editor = WindowEditorClass.get_editor('Mac OS')
mac_window_editor.make_window()


ubuntu_window_editor = WindowEditorClass.get_editor('Ubuntu')
ubuntu_window_editor.make_window()