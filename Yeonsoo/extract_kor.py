import pytesseract
import cv2
import os

pytesseract.pytesseract.tesseract_cmd = r'C:\Program Files\Tesseract-OCR\tesseract.exe'
result = open("C:/Users/KANG/OneDrive/문서/GitHub/DObackend/Yeonsoo/images/output.txt","w", encoding='cp949') #인코딩에러

path_dir = 'C:/Users/KANG/OneDrive/문서/GitHub/DObackend/Yeonsoo/images'
file_list = os.listdir(path_dir)



for file_name in file_list :
    if file_name == "output.txt":
        continue
    result.write(pytesseract.image_to_string('C:/Users/KANG/OneDrive/문서/GitHub/DObackend/Yeonsoo/images/'+file_name,lang='ENG+KOR',config='--psm 4 -c preserve_interword_spaces=1')+'\n')
result.close()
print("Successfully done")

