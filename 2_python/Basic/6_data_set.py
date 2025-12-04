#세트 -> 자바 Set구조와, 유사!
# 특징 -> 순서유지 x , 중복 허용 x

s = {1,2,3,2,4,5} # 2가 중복되게 2개 나열함,
print(s) # 중복되는 데이터는 제거가 된다.


#데이터 추가 
s.add(6)
print(s)

s.add(3) # 추가 안됨 중복되기 때문에
print(s)

# 데이터 삭제
s.discard(2) # 데이터 삭제
print(s)
s.discard(2) # 데이터가 없는데 또 삭제하려고 할 경우 무시된다. 오류 없음.
print(s)

s.remove(3)     #3데이터 삭제
print(s)
# s.remove(3)     # 위와 똑같은 상황, remove는 keyError라는 오류 발생
# print(s)

# 집합 연산이 가능하다.
s2 = {1,2,3}
s3 = {3,4,5}

print("합집합: " , s2 | s3, s2.union(s3)) # | 기호는 합집합 연산자, union 합집합을 만들어주는 집합메서드
print("교집합: " , s2 & s3, s2.intersection(s3)) # & 기호와 , 메서드intersection
print("차집합: " , s2 - s3, s2.difference(s3)) # 기호 - 메서드 difference

#데이터 접근(조회)  
for item in s2: #item(변수명) , s2 는 위에
    print(item)