'''
Created on Nov 27, 2016

@author: Admin
'''

from Strategy import *
from src.behavioral.strategy import Strategy

def main():
    cart = ShoppingCart()
    cart.add_item('Pasta', 1.0)
    cart.add_item('Basil', 0.5)
    cart.add_item('Tomatoes', 0.7)
    
    cart.pay(Strategy.payment_methods['credit_card'], 'xxxx-xxxx-xxxx-xxxx')
    cart.pay(Strategy.payment_methods['paypal'], 'test@paypal.com')

if __name__ == "__main__":
    main()