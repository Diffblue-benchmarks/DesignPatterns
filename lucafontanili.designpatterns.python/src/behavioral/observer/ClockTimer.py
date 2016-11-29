'''
Created on Nov 13, 2016

@author: Admin
'''

from datetime import datetime
from abc import abstractmethod

class ClockTimer:
    
    _observers = []
    
    def hour(self):
        return self._now.hour
        
    def minute(self):
        return self._now.minute
    
    def second(self):
        return self._now.second
    
    def tick(self):
        self.__body()
        [observer.update(self) for observer in self._observers]
        
    def __body(self):
        self._now = datetime.now()
        
    def add_observer(self, observer):
        self._observers.append(observer)
        
class ObserverClass:
    
    @staticmethod
    @abstractmethod
    def update(timer):
        pass

class ClockObserver12(ObserverClass):
    
    @staticmethod
    def update(timer):
        print(str(12 if timer.hour() % 12 == 0 else timer.hour() % 12) + '-' + 
              str(timer.minute()) + '-' + str(timer.second()) + 
              (' PM' if timer.hour()/12 == 1 else ' AM'))
        
class ClockObserver24(ObserverClass):
    
    @staticmethod
    def update(timer):
        print(str(timer.hour()) + '-'  + str(timer.minute()) + '-' + str(timer.second()))