import mysql.connector

conn = mysql.connector.connect(
    host='localhost',
    user='root',
    password='yashraj@123',
    database='testdb'
)

cursor = conn.cursor()

cursor.execute("""
    CREATE TABLE IF NOT EXISTS students (
        student_id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(250),
        student_class VARCHAR(250),
        year INT,
        CGPA FLOAT,
        gender VARCHAR(25)
    )
""")
conn.commit()
print("Table 'students' is ready.")

def insert_student(name, student_class, year, cgpa, gender):
    cursor.execute("INSERT INTO students (name, student_class, year, cgpa, gender) VALUES (%s, %s, %s, %s, %s)", 
                   (name, student_class, year, cgpa, gender))
    conn.commit()
    print(f"Student Record Inserted: {name}")

def update_student(student_id, new_cgpa):
    cursor.execute("UPDATE students SET CGPA = %s WHERE student_id = %s", (new_cgpa, student_id))
    conn.commit()
    print(f"Student Record Updated! ID: {student_id}, New CGPA: {new_cgpa}")

def delete_student(student_id):
    cursor.execute("DELETE FROM students WHERE student_id = %s", (student_id,))
    conn.commit()
    print(f"Student Record Deleted! ID: {student_id}")

def fetch_students():
    cursor.execute("SELECT * FROM students")
    students = cursor.fetchall()
    print("\n Student Records:")
    for student in students:
        print(student)

insert_student("Rashi", "FYIT", 2025, 9.8, "Female")
insert_student("Raya", "SYCS", 2024, 9.6, "Female")
insert_student("Yashraj", "TYCS", 2023, 9.7, "Male")

update_student(2, 9.85)
delete_student(1)
delete_student(3)

fetch_students()

cursor.close()
conn.close()
print("Database Connection Closed.")
