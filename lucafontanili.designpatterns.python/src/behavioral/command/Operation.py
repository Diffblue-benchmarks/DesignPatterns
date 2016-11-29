'''
Created on Nov 9, 2016

@author: Admin
'''
from abc import abstractmethod

class OperationClass(object):
    
    @staticmethod
    @abstractmethod
    def __do_operation():
        pass
    
    @staticmethod
    def execute(do):
        do()
    
class CopyOperation(OperationClass):
    
    @staticmethod
    def __do_operation():
        print('Copying file')
        
    def execute(self):
        super(CopyOperation, self).execute(self.__do_operation)
        
class AddOperation(OperationClass):
    
    @staticmethod
    def __do_operation():
        print('Creating new file')
        
    def execute(self):
        super(AddOperation, self).execute(self.__do_operation)