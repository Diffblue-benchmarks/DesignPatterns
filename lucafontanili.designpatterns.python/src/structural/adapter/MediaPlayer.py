'''
Created on Nov 5, 2016

@author: Admin
'''

from AudioPlayer import *

class MediaPlayerClass:
    
    _audio_player = AudioPlayerClass() 
    _audio_extensions = ['flac', 'mp3']
    
    def play(self, title):
        if title.split('.')[1] in self._audio_extensions:
            self._audio_player.play_song(title)
        else:
            print('Playing movie: ' + title)