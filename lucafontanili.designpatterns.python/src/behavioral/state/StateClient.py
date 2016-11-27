'''
Created on Nov 27, 2016

@author: Admin
'''
from TCPConnection import *
from src.behavioral.state import TCPConnection

def main():
    tcp = TCPConnectionClass()
    tcp.execute(TCPConnection.states['close'])
    tcp.execute(TCPConnection.states['open'])
    tcp.execute(TCPConnection.states['close'])
    tcp.execute(TCPConnection.states['establish'])
    tcp.execute(TCPConnection.states['close'])

if __name__ == "__main__" :
    main()