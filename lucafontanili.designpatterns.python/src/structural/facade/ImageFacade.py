'''
Created on Nov 9, 2016

@author: Admin
'''

class ImageCompressor:
    
    @staticmethod
    def compress_image(image_name, output_file):
        print('Compressing image ' + image_name + ' to ' + output_file) 
    
class ImageReader:

    @staticmethod    
    def read_image(image_name):
        print('Reading image ' + image_name)
        return image_name

class ImageFacadeClass:
    
    _instances = {}

    def __new__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(ImageFacadeClass, cls).__new__(cls, *args, **kwargs)
        return cls._instances[cls]
    
    @staticmethod
    def zip_image(image_name, ouptut_file):
        ImageCompressor.compress_image(ImageReader.read_image(image_name), ouptut_file)