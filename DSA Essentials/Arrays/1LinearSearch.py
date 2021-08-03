# Time O(n) | Aux space O(1)

def linSearch(arr, key):
    for index, value in enumerate(arr) :
        if value == key:
            return index
    # -1 for element not present
    return -1

arr = [10, 15, 12, 9, 6, 4, 3, 10, 0]

element = int(input())
print(linSearch(arr, element))