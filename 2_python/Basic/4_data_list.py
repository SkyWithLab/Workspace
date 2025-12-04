# 리스트 -> 배열같은/ ArrayList와 유사하다
#   특징 -> 중복허용, 순서유지, 가변(수정가능)
fruits = ["바나나", "사과","딸기", "복숭아", "배"]

#인덱싱 
print("첫번째 과일:", fruits[0]) #바나나
print("마지막 과일:", fruits[-1]) #배

# 슬라이싱
print("두번째, 세번째 과일 :", fruits[1:3]) # 1,2 인덱스로 접근가능

# 리스트에 데이터 추가하기
fruits.append("무화과") # 바나나, 사과, 딸기, 복숭아, 배, 무화과    추가됨...
print(fruits)

fruits.insert(3,"두리안") # 중간에 추가 가능한, 인덱스 지정 가능
print(fruits)

fruits.extend(["메론","수박"]) # 또 다른 리스트 데이터를 끝에 추가 할 수 있음
print(fruits)


# 데이터 삭제 : remove, pop
fruits.pop()# 맨끝 마지막꺼 삭제됨
print(fruits)
item = fruits.pop() # 젤 끝에 있는거 삭제하면서 동시에 그 값을 반환시켜줌.
print(item)


fruits.remove("두리안") #데이터를 지정하여 삭제할 수 있음.
print(fruits)


#정렬하는 ( 오름차순 내림차순 등) 메소드
# nums = [5,3,9,1]

# nums.sort() #1,3,5,9 오름차순으로 정ㄹ렬이 됨
# print(nums) 
# nums.reverse() #내림차순 정렬 (역순 재배치)
# print(nums) #9,5,3,1 이렇게..

print()
print()

# reverse를 안쓰고도 내림차순 정렬을 할 수가 있음
nums = [5,3,9,1]
nums.sort(reverse = True)
print(nums)

words = ["apple", "banana", "cat"]
words.sort(key=len) # 데이터 길이를 기준으로 정렬하겠다.
print(words)
words.sort(key=len, reverse=True)
print(words)