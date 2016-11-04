'''
Created on Nov 3, 2016

@author: Admin
'''
from Singleton import *

logger1 = Logger();
logger2 = Logger();

print logger1 is logger2 #True