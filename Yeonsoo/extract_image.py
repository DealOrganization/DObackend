import cv2
import numpy as np

#입력이미지
img_rgb = cv2.imread('C:/Users/KANG/OneDrive/문서/GitHub/DObackend/Yeonsoo/images/carrot5.png')
#찾고자 하는 이미지
template = cv2.imread('C:/Users/KANG/OneDrive/문서/GitHub/DObackend/Yeonsoo/images/carrot_sign.png')
h, w = template.shape[:-1] #템플릿의 가로, 세로 길이

res = cv2.matchTemplate(img_rgb, template, cv2.TM_CCOEFF_NORMED)
threshold = .8
loc = np.where(res >= threshold)


for pt in zip(*loc[::-1]):  # Switch collumns and rows
    print(pt)
    cv2.rectangle(img_rgb, pt, (pt[0] + w, pt[1] + h), (0, 0, 255), 2)

cv2.imshow(img_rgb)