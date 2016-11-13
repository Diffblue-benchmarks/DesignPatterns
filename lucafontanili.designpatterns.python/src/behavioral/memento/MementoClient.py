'''
Created on Nov 13, 2016

@author: Admin
'''

from Memento import *

def main():
    originator = Originator()
    originator.set_state("First")
    print(originator.state())
    originator.set_state('Second')
    print(originator.state())
    for memento in originator.hisotry():
        print memento.to_string()
    print('Undo')
    originator.undo()
    print(originator.state())
    originator.set_state('Third')
    print(originator.state())
    for memento in originator.hisotry():
        print memento.to_string()

if __name__ == "__main__":
    main()