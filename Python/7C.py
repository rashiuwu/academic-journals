dict_={"Name":"Rashi","Age":19,"Gender":"Female"}
print("Keys in dictionary:")
for key in dict_:
 print(key)
print("Values in dictionary:")
values=list(dict_.values())
i=0
while i<len(values):
 print(values[i])
 i+=1
dict_["dict1"]={"a":1,"b":2}
dict_["dict2"]={"x":10,"y":20}
dict_["dict3"]={"p":"Hello","q":"World"}
dict_.popitem()
print(dict_)
ditto=dict_.copy()
print(ditto)
