batch={"Rashi":6,"Yashraj":1,"Raya":2}
default=[name for name,attend in batch.items() if attend<=3]
print(default)
