# Time O(n) | Aux space O(N) (need to check why python wasn't modifying with same name)

def revArr(nums):
    left = 0
    right = len(nums)-1
    arr = nums.copy()

    while(left < right):
        temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left += 1
        right -= 1

    return arr

nums = [10, 15, 12, 9, 6, 4, 3, 10, 0]
print(nums, "\n", revArr(nums))