#!/bin/python
"""
Given s in CamelCase, print the number of words in s on a new line.
"""
import sys

s = raw_input().strip()
print sum(s[i].isupper() for i in range(len(s))) + 1
