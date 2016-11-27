'''
Created on Nov 27, 2016

@author: Admin
'''

from MediaPlayer import *

def main():
    video = VideoFile('slevin')
    video.open()
    audio = AudioFile('anthem')
    audio.open()

if __name__ == '__main__':
    main()