'''
Created on Nov 12, 2016

@author: Admin
'''

class WidgetMediator(object):
    
    _instances = {}
    
    def __new__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(WidgetMediator, cls).__new__(cls, *args, **kwargs)
        return cls._instances[cls]
    
    def set_button(self, button):
        self._button = button
        
    def set_text_box(self, text_box):
        self._text_box = text_box
    
    def button_clicked(self, button):
        if not button.enabled():
            print('Button disabled, please enter some text')
            return
        
        self._text_box.clear_text()
        self._button.set_enabled(False)
        print('Text Cleared')
        
    def entered_text(self, text_box):
        if not text_box.message() == "":
            self._button.set_enabled(True)
            print('Entered: ' + text_box.message())
    
class Widget(object):
    
    def __init__(self):
        self._mediator = WidgetMediator()
        
class Button(Widget):
    
    def __init__(self):
        super(Button, self).__init__()
        self._enabled = False
        self._mediator.set_button(self)
        
    def click(self):
        self._mediator.button_clicked(self)
        
    def set_enabled(self, enabled):
        self._enabled = enabled
        
    def enabled(self):
        return self._enabled
    
class TextBox(Widget):
    
    def __init__(self):
        super(TextBox, self).__init__()
        self._message = ""
        self._mediator.set_text_box(self)
        
    def enter_text(self, message):
        self._message = message
        self._mediator.entered_text(self)
        
    def clear_text(self):
        self._message = ""
        
    def message(self):
        return self._message