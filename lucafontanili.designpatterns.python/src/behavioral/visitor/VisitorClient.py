'''
Created on Nov 29, 2016

@author: Admin
'''

from Visitor import *
from Equipment import *

def main():
    floppy = FloppyDiskEquipment(10, 7, 'floppy')
    floppy_disk_visitor = FloppyDiskVisitor()
    floppy.accept(floppy_disk_visitor)
    print('Total floppy price: ' + str(floppy_disk_visitor.total()))
    
    chassis = ChassisEquipment()
    chassis.add_component(8, 6, 'Bus')
    chassis.add_component(4, 2, 'RAM')
    chassis_visitor = ChassisVisitor()
    chassis.accept(chassis_visitor)
    print('Inventory:')
    [component.to_string() for component in chassis_visitor.inventory()]

if __name__ == "__main__":
    main()