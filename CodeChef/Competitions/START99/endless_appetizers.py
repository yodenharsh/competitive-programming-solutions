import math


def max_plates(X, Y, R):
    if R == 0:
        return int(math.ceil(X/Y))

    sticks_eaten = (R/30) + X
    plates_taken = int(math.ceil((sticks_eaten/Y)))
    return plates_taken


T = int(input())
while T > 0:
    input_arr = input().split(' ')
    print(max_plates(int(input_arr[0]), int(input_arr[1]), int(input_arr[2])))
    T = T - 1
