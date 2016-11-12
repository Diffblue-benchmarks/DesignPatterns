'''
Created on Nov 12, 2016

@author: Admin
'''

from HelpHandler import *
from Widget import *

def main():
    application_topics = [HelpHandlerClass.PRINT_BUTTON, 
                          HelpHandlerClass.SAVE_BUTTON,
                          HelpHandlerClass.WIDGET]
    application_handler = ApplicationHelpHandler(None, application_topics)
    
    button_topics = [HelpHandlerClass.PRINT_BUTTON,
                     HelpHandlerClass.SAVE_BUTTON]
    button_handler = ButtonHelpHandler(application_handler, button_topics)
    
    print_button_topics = [HelpHandlerClass.PRINT_BUTTON]
    print_button_handler = PrintButtonHelpHandler(button_handler, print_button_topics)
    
    print_button = PrintButton(print_button_handler)
    print_button.draw()
    print_button.show_help()
    
    save_button = SaveButton(button_handler)
    save_button.show_help()
    
    button = GenericButton(button_handler)
    button.show_help()

if __name__ == "__main__":
    main()