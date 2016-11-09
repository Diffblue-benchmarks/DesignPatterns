'''
Created on Nov 9, 2016

@author: Admin
'''

class ImageClass:
    
    _file_name = None
    
    def __init__(self, file_name):
        self._file_name = file_name
        self.__load__()
        
    def draw(self):
        pass

class RealImage(ImageClass):
    
        
    def __load__(self):
        print('Loading image ' + self._file_name + ' from disk')
        
    def draw(self):
        print('Drawing image ' + self._file_name)
        
class ProxyImage:
    
    _real_image = None
    _file_name = None
    
    def __init__(self, file_name):
        self._file_name = file_name
        
    def draw(self):
        if self._real_image is None:
            self._real_image = RealImage(self._file_name)
        self._real_image.draw()