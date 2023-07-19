def toggle(s):
    string=""
    for i in range(len(s)):

        if ord(s[i])>=65 and ord(s[i])<=90:
            string+=(chr(ord(s[i])+32))
        elif ord(s[i])>=97 and ord(s[i])<=122:
            string+=(chr(ord(s[i])-32))

    return string

s = input()
print(toggle(s))