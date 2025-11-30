def check_pass(password):
    if len(password) < 8:
        print("Error! Password must be at least 8 characters long.")
        return False
    if not any(char.isdigit() for char in password):
        print("Error! Password must contain at least one digit.")
        return False
    if not any(char.isupper() for char in password):
        print("Error! Password must contain at least one uppercase letter.")
        return False

    print("Password is valid")
    return True

password = "Rashi@8905"
check_pass(password)
