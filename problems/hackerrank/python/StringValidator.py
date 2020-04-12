if __name__ == '__main__':
    s = input()
    print(
        True in [x.isalnum() for x in s], 
        True in [x.isalpha() for x in s],
        True in [x.isdigit() for x in s],
        True in [x.islower() for x in s],
        True in [x.isupper() for x in s],
        sep='\n'
        )
