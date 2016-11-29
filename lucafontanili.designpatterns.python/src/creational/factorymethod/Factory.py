'''
Created on Nov 3, 2016

@author: Admin
'''
from Trace import *
class TraceFactory:
    
    @staticmethod
    def get_trace(trace_type):
        if trace_type == 'FILE':
            return FileTrace()
        if trace_type == "SYSTEM":
            return SystemTrace()
    