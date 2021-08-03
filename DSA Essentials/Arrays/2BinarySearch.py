# Note Binary search is for sorted array
# Time O(logn) | Aux Space O(1)

def binSearch(arr, value):
    left = 0
    right = len(arr)-1

    while(left <= right):
        mid = (left+right)//2
        if value == arr[mid]:
            return mid
        elif value < arr[mid]:
            right = mid-1
        else:
            left = mid+1
    return -1
        

arr = [0, 3, 4, 6, 9, 10, 10, 12, 15]
arr.sort()
element = int(input())
print(binSearch(arr, element))