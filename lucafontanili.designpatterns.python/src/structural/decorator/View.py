'''
Created on Nov 6, 2016

@author: Admin
'''

class ViewClass(object):
    
    def draw(self):
        pass
    
class ImageView(ViewClass):
    
    def draw(self):
        print('Creating an ImageView')
        

class TextView(ViewClass):
    
    def draw(self):
        print('Creating an TextView')
        
class ViewDecorator(ViewClass):
    
    _view = None
    
    def __init__(self, view):
        self._view = view
    
    def draw(self):
        self._view.draw()
        
class BorderDecorator(ViewDecorator):
    
    def draw(self):
        super(BorderDecorator, self).draw()
        self.draw_border()
        
    def draw_border(self):
        print('Adding border to the view')