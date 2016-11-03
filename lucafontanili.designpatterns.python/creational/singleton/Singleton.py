'''
Created on Nov 3, 2016

@author: Admin
'''
class SingletonClass(object):
    
    _instances = {}
    
    def __new__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(SingletonClass, cls).__new__(cls, *args, **kwargs)
        return cls._instances[cls]

class Logger(SingletonClass):
    pass