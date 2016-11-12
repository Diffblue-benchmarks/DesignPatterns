'''
Created on Nov 12, 2016

@author: Admin
'''
from Widget import *

def main():
    button = Button()
    text_box = TextBox()
    
    button.click()
    text_box.enter_text('Hi!')
    button.click()

if __name__ == "__main__":
    main()