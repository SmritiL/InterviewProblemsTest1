vigenereTable = list()
for i in range(0,26):
    inc = 0
    vigRow = list()
    for j in range(0,26):
        if (i+65+inc)>90:
            vigRow.append(chr((i+65+inc)-26))
            inc+=1
        else:
            vigRow.append(chr(i+65+inc))
            inc+=1
    vigenereTable.append(vigRow)
