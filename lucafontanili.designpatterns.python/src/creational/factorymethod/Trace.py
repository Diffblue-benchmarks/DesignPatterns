'''
Created on Nov 3, 2016

@author: Admin
'''

import logging

class TraceClass(object):
    
    def __init__(self):
        logging.basicConfig(filename='../../../log.log',level=logging.DEBUG)
        self.debug = False
    
    def set_debug(self, debug):
        self.debug = debug
    

class FileTrace(TraceClass):
        
    def debug(self, message):
        if self.debug is True:
            logging.debug('DEBUG:' + message)
    
    @staticmethod
    def error(message):
        logging.error('ERROR: ' + message)
         
         
            
    
class SystemTrace(TraceClass):
        
    def debug(self, message):
        if self.debug is True:
            print('DEBUG on system: ', message)
         
    @staticmethod
    def error(message):
        print('ERROR on system: ', message)