'''
Created on Nov 27, 2016

@author: Admin
'''
from abc import abstractmethod

states = {'close': 0, 'open': 1, 'establish': 2, 'empty' : 3}

class TCPState(object):
    @abstractmethod
    def execute(self, tcp_state):
        pass
        
    @abstractmethod
    def doOperation(self, state):
        pass

        
class TCPStateClose(TCPState):
    
    @abstractmethod
    def execute(self, tcp_state):
        return self.doOperation(tcp_state)
    
    def doOperation(self, state):
        if state is states['establish']:
            print 'Connection closed'
        else:
            print 'Cannot close an non-established connectionCannot close an non-established connection'
        return state == states['establish']
    
class TCPStateOpen(TCPState):
    
    @abstractmethod
    def execute(self, tcp_state):
        return self.doOperation(tcp_state)
    
    def doOperation(self, state):
        if state is states['empty']:
            print 'Connection opened'
        else:
            print 'Cannot open a non-empty connection'
        return state == states['empty']
    
class TCPStateEstablish(TCPState):
    
    @abstractmethod
    def execute(self, tcp_state):
        return self.doOperation(tcp_state)
    
    def doOperation(self, state):
        if state is states['open']:
            print 'Connection established'
        else:
            print 'Cannot establish a non-opened connection'
        return state == states['open']

class TCPConnectionClass:
    _state_map = {}
    
    def __init__(self):
        self._state = states['empty']
        self.__init_map()
        
    def __init_map(self):
        self._state_map[states['close']] = TCPStateClose()
        self._state_map[states['open']] = TCPStateOpen()
        self._state_map[states['establish']] = TCPStateEstablish()
        
    def execute(self, state):
        update = self._state_map[state].execute(self._state)
        if update is True:
            self._state = state
            
