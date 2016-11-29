'''
Created on Nov 29, 2016

@author: Admin
'''
from dis import disco
from abc import abstractmethod

class EquipmentClass:
    
    def __init__(self, net_price = 0, discount_price = 0, name = ''):
        self._net_price = net_price
        self._discount_price = discount_price
        self._name = name
        
    def net_price(self):
        return self._net_price
    
    def discount_price(self):
        return self._discount_price
    
    def name(self):
        return self._name
    
    @abstractmethod
    def accept(self, visitor):
        pass
    
class FloppyDiskEquipment(EquipmentClass):
    
    @abstractmethod
    def accept(self, visitor):
        visitor.visit_floppy_disk(self)
        
class ComputerEquipment(EquipmentClass):
    
    @abstractmethod
    def accept(self, visitor):
        visitor.visit_computer_component(self)
        
    def to_string(self):
        print(self._name)
        
class ChassisEquipment(EquipmentClass):
    
    _components = []
    
    @abstractmethod
    def accept(self, visitor):
        [component.accept(visitor) for component in self._components]
        visitor.visit_chassis(self)
        
    def add_component(self, net_price, discount_price, name):
        self._components.append(ComputerEquipment(net_price, discount_price, name))
        
    def components(self):
        return self._components