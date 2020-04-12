from itertools import combinations_with_replacement

if __name__ == '__main__':
    s, i = input().split(" ")
    for x in combinations_with_replacement(sorted(s), int(i)):
        print("".join(x))
