'''
Created on Nov 3, 2016

@author: Admin
'''
class TraceClass(object):
    
    def __init__(self):
        self.debug = False
    
    def set_debug(self, debug):
        self.debug = debug
    

class FileTrace(TraceClass):
        
    def debug(self, message):
         if self.debug is True:
             print 'DEBUG on file: ', message
    
    def error(self, message):
         print 'ERROR on file: ', message
         
         
            
    
class SystemTrace(TraceClass):
        
    def debug(self, message):
         if self.debug is True:
             print 'DEBUG on system: ', message
         
         
    def error(self, message):
         print 'ERROR on system: ', message