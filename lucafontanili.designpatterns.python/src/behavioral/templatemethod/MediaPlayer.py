'''
Created on Nov 27, 2016

@author: Admin
'''
from abc import abstractmethod

class Media(object):
    
#     def __init__(self):
#         pass
     
    def __init__(self, file_name, extension):
        self._file_name = file_name
        self._extension = extension
        
    def file_name(self):
        return self._file_name
    
    @abstractmethod
    def open_player(self):
        pass
    
    def play(self):
        print('Playing ' + self._file_name + '' + self._extension)
        
    def open(self):
        self.open_player()
        self.play()
        
class VideoFile(Media):
    
    def __init__(self, file_name):
        super(VideoFile, self).__init__(file_name, '.mkv')
        
    def open_player(self):
        print('Opening VLC')

        
        
class AudioFile(Media):
    
    def __init__(self, file_name):
        super(AudioFile, self).__init__(file_name, '.flac')
        
    def open_player(self):
        print('Opening iTunes')
        