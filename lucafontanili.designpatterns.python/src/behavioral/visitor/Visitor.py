'''
Created on Nov 29, 2016

@author: Admin
'''
from abc import abstractmethod

class EquipmentVisitor:
    
    @abstractmethod
    def visit_floppy_disk(self, floppy_disk):
        pass

    @abstractmethod
    def visit_chassis(self, chassis):
        pass
    
    @staticmethod
    def visit_computer_component(computer_equipment):
        print('Added ' + computer_equipment.name())
        
class FloppyDiskVisitor(EquipmentVisitor):
    
    def __init__(self):
        self._total = 0
    
    def total(self):
        return self._total
    
    def visit_floppy_disk(self, floppy_disk):
        self._total += floppy_disk.net_price()
        
    def visit_chassis(self, chassis):
        self._total += chassis.discount_price()
        
class ChassisVisitor(EquipmentVisitor):
    
    _inventory = []
    
    def inventory(self):
        return self._inventory
    
    def visit_floppy_disk(self, floppy_disk):
        pass
    
    def visit_chassis(self, chassis):
        [self._inventory.append(component) for component in chassis.components()]