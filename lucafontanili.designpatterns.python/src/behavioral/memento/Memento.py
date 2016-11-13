'''
Created on Nov 13, 2016

@author: Admin
'''

class MementoClass:
    
    def __init__(self, new_state):
        self._state = new_state
        
    def state(self):
        return self._state
    
    def to_string(self):
        return '[state=' + self._state + ']'
    
class CareTaker:
    
    _states = []
    
    def add(self, memento):
        self._states.append(memento)
        
    def get(self, index):
        return self._states[index]
    
    def remove(self, index):
        del self._states[index]
        
    def history(self):
        return self._states
    
class Originator:
    
    _count = 0
    _care_taker = CareTaker()
    
    def state(self):
        return self._state
    
    def set_state(self, new_state):
        self._count += 1
        self._care_taker.add(MementoClass(new_state))
        self._state = new_state
        
    def hisotry(self):
        return self._care_taker.history()
    
    def undo(self):
        self._count -= 1
        self._care_taker.remove(self._count)
        self._state = self._care_taker.get(self._count - 1).state()
        