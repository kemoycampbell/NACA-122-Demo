SECRET = "SEC_BYPASS"

while True:
    password = input("Enter the password:")
    password = password.replace(SECRET, "")

    if password == SECRET:
        print("You get it")
    else:
        print("I promise you, .replace is weak and bypassable!")