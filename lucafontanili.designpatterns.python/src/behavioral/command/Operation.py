'''
Created on Nov 9, 2016

@author: Admin
'''
from abc import abstractmethod

class OperationClass(object):
    
    @abstractmethod
    def __do_operation(self):
        pass
    
    def execute(self, do):
        do()
    
class CopyOperation(OperationClass):
    
    def __do_operation(self):
        print('Copying file')
        
    def execute(self):
        super(CopyOperation, self).execute(self.__do_operation)
        
class AddOperation(OperationClass):
    
    def __do_operation(self):
        print('Creating new file')
        
    def execute(self):
        super(AddOperation, self).execute(self.__do_operation)