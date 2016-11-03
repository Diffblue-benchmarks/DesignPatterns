'''
Created on Nov 3, 2016

@author: Admin
'''
from Factory import *

file_trace = TraceFactory().get_trace('FILE')
file_trace.set_debug(False)
file_trace.error('SHUT DOWN')


system_trace = TraceFactory().get_trace('SYSTEM')
system_trace.set_debug(False)
system_trace.error('SHUT DOWN')