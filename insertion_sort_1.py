# -*- coding: utf-8 -*-
"""Program to insert an unsorted element into a sorted list."""


def insertion_sort(ar):
    """Function for insertion sort.

    It takes the user array and output the entire
    array every time an item is shifted in it.
    """
    end = ar[len(ar) - 1]
    for i in range(len(ar) - 1, -1, -1):
        if end < ar[i - 1]:
            ar[i] = ar[i - 1]
            if i == 0:
                ar[i] = end
            print ' '.join(str(elem) for elem in ar)
        else:
            ar[i] = end
            print ' '.join(str(elem) for elem in ar)
            return

m = input()
ar = [int(i) for i in raw_input().strip().split()]
insertion_sort(ar)
