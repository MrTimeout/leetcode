def average(array):
    r = 0
    s = set(array)
    for x in s:
        r += x
    return r/len(s)

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
