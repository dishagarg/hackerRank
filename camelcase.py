# -*- coding: utf-8 -*-
"""Given s in CamelCase, print the number of words in s on a new line."""

s = raw_input().strip()
print sum(s[i].isupper() for i in range(len(s))) + 1
