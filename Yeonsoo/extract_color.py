import extcolors
#from PIL import Image



for i in range (1,5):
    img = "./images/lightning0"
    img = img + str(i)+ ".jpg"
    colors, pixel_count = extcolors.extract_from_path(img)
    print(i)
    print(colors)
    print()


