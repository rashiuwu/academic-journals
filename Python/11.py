import tkinter as tk
from tkinter import messagebox

def validate_login():
    username = user_entry.get()
    password = pass_entry.get()
    if username == "admin" and password == "1234":
        messagebox.showinfo("Login", "Login successful, Welcome to the Admission System")
    else:
        messagebox.showerror("Login", "Invalid username or password")

pl=tk.Tk()
pl.title("Admission Page")
pl.geometry("300x200")

user_label=tk.Label(pl,text="username:")
user_label.grid(row=0,column=0,pady=10,padx=5)
user_entry=tk.Entry(pl)
user_entry.grid(row=0,column=1)

pass_label=tk.Label(pl,text="Password:")
pass_label.grid(row=1,column=0,pady=10,padx=5)
pass_entry=tk.Entry(pl,show="*")
pass_entry.grid(row=1,column=1)

btn=tk.Button(pl,text="Login",command=validate_login)
btn.grid(row=2,column=0,columnspan=2,pady=10)

pl.mainloop()
