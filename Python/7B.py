tuple1=(1,2,3)

tuple2=("a","b","c")

joined_tuple=tuple1+tuple2

print("Joined Tuple:",joined_tuple)

first_element=joined_tuple[0]

last_element=joined_tuple[-1]

print(first_element)

print(last_element)

swapped_tuple=(last_element,)+joined_tuple[1:-1]+(first_element,)

print("Swapped Tuple:",swapped_tuple)

sliced_tuple=joined_tuple[1:-1]

print("Sliced Tuple:",sliced_tuple)
