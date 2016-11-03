'''
Created on Nov 3, 2016

@author: Admin
'''
from Trace import *
class TraceFactory:
    def get_trace(self, trace_type):
        if trace_type == 'FILE':
            return FileTrace()
        if trace_type == "SYSTEM":
            return SystemTrace()
    