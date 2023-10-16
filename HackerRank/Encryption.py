#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'encryption' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def encryption(s):
    s = s.replace(" ", "")
    
    floored_len = math.floor(math.sqrt(len(s)))
    ceiled_len = math.ceil(math.sqrt(len(s)))
    
    min_area = 2147483647
    
    rows = 0
    cols = 0
    
    for i in range(floored_len, ceiled_len+1):
        for j in range(i, ceiled_len+1):
            area = i * j
            if area >= len(s) and area < min_area:
                min_area = area
                rows = i
                cols = j
    curr_index = 0
    
    final_list = []
    print(rows, " ", cols)
    for i in range(rows):
        if not i == rows - 1:
            final_list.append(list(s[curr_index:curr_index+cols]))
        else:
            final_list.append(list(s[curr_index:]))
        curr_index += cols
    
    print(final_list)
    
    max_length = max(len(word_list) for word_list in final_list)
    
    # Create a list to store the i-th elements
    combined_words = []
    
    # Iterate from 0 to max_length-1 to extract the i-th element from each inner list
    for i in range(max_length):
        word = "".join(word_list[i] if i < len(word_list) else "" for word_list in final_list)
        combined_words.append(word)
    
    # Join the combined words with a whitespace
    result = " ".join(combined_words)
    return result
    
            
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()
    
    result = encryption(s)

    fptr.write(result + '\n')

    fptr.close()
