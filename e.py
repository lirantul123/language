def view():
    starP = ""
    with open('passwords.txt', 'r') as f:
        for line in f.readlines():
            data = line.rstrip()
            user, passw = data.split("|")
            for i in range(len(passw)):
                starP+="*"
            print("User:", user, "| Password:", starP)


def add():
    name = input('Account Name: ')
    pwd = input("Password: ")

    with open('passwords.txt', 'a') as f:
        f.write(name + " | " + pwd + "\n")

def game():
    count=0
    a = input("What is RAM: ".lower())
    if a == "random access memory":
        count+=1
    else:
        pass

    b = input("What is 1+1: ".lower())
    if b == "2":
        count+=1
    else:
        pass

    c = input("What is 2+2: ".lower())
    if c == "4":
        count+=1
    else:
        pass

    d = input("What is 3+3: ".lower())
    if d == "6":
        count+=1
    else:
        pass
    print ("You got ", (count/4)*100, "%.")


while True:
    mode = input(
        "Would you like to add a new password or view existing ones (view, add), press q to quit? ").lower()
    if mode == "q":
        break
    
    if mode == "game":
        game()
    if mode == "view":
        view()
    elif mode == "add":
        add()
    else:
        print("Invalid mode.")
        continue