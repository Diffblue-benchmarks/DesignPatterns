'''
Created on Nov 27, 2016

@author: Admin
'''
from abc import abstractmethod

payment_methods = {'paypal': 0, 'credit_card':1}

class PaymentMethod:
    
    @staticmethod
    @abstractmethod
    def pay(payment_account, price):
        pass
    
class PayPalPaymentMethod(PaymentMethod):
    
    @staticmethod
    def pay(payment_account, price):
        print('Paying $' + str(price) + ' with PayPal account ' + payment_account)
        
class CreditCardPaymentMethod(PaymentMethod):
    
    @staticmethod
    def pay(payment_account, price):
        print('Paying $' + str(price) + ' with credit card ' + payment_account)

class PaymentMethodFactory:
    
    @staticmethod
    def get_payment_method(self, method):
        if method is payment_methods['paypal']:
            return PayPalPaymentMethod()
        elif method is payment_methods['credit_card']:
            return CreditCardPaymentMethod()
        else:
            return None

class ShoppingCart:
    _basket = {}
    
    def add_item(self, item, price):
        self._basket[item] = price
        
    def pay(self, method, account):
        payment_method = PaymentMethodFactory.get_payment_method(self, method)
        payment_method.pay(account, sum(price for price in self._basket.values()))