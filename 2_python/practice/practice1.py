# practice1.py
'''
    입력함수 -> input(출력할 내용): 입력된 값
-> 기본적으로 입력된 값을 문자열 타입으로 리턴해준다.
    ex) name = input("이름 입력:")

'''

# 1. 이름, 성별, 나이, 키 입력받아 출력
#  * 출력 형식 : 이름: xxx, 성별: xx, 나이: xx, 키: xx.xxcm
'''
# name = input("이름 :")
# gender = input("성별 :")
# age = input("나이 :")
# height = input("키 :")

# print(f"이름: {name}, 성별: {gender}, 나이: {age}, 키: {height}cm....!!")
'''
# 2. 두 정수 입력받아 합, 차, 곱, 몫, 나머지 계산 후 출력
'''
n1 =int(input ("첫번째숫자:"))
m1 =int(input ("두번째숫자:"))

print(f"{n1} + {m1} = {n1 + m1}")
print(f"{n1} - {m1} = {n1 - m1}")
print(f"{n1} * {m1} = {n1 * m1}")
print(f"{n1} // {m1} = {n1 // m1}")
print(f"{n1} % {m1} = {n1 % m1}")
'''
# 3. 영어 문자열 입력받아 앞 세 글자 출력

data = intup("영어입력:")

# print("앞세글자 :", data[0:3])
# print("앞세글자 :", data[:3])

# print()


# 4. 실수 2개 입력받아 합, 차, 곱, 나누기 출력


# f1 = float(input("실수1입력:"))
# f2 = float(input("실수2입력:"))

# print(type(f1))

# print(f"{f1}+{f2}= {f1+f2}")
# print(f"{f1}-{f2}= {f1-f2}")
# print(f"{f1}*{f2}= {f1*f2}")
# print(f"{f1}/{f2}= {f1/f2}")




# 5. 두 수 입력받아 제곱과 제곱근 계산
#  각각 제곱, 제곱근

# n = int(input("숫자1입력:"))
# n2 = int(input("숫자2입력:"))

# print(f"{n}의 제곱 :{n**2}, 제곱근 : {n**0.5}")
# print(f"{n2}의 제곱 :{n2**2}, 제곱근 : {n2**0.5}")

# 6. 문자열 입력받아 대문자/소문자/글자 수 출력

# n1 = input("문자열입력:")

# print(f"대문자:{n1.upper()}")
# print(f"소문자:{n1.lpwer()}")
# print(f"글자수:{len(data)}")

# 7. 좋아하는 음식 3개 입력받아 리스트처럼 저장 후 출력

# foods = [] # 비어있는 리스트

# food1 = input("좋아하는 음식1")
# food2 = input("좋아하는 음식2")
# food3 = input("좋아하는 음식3")
              

# print("좋아하는 음식 리스트:" foods)
# print("첫 번째 음식:" foods[0])
# print("마지막 음식:" foods[-1])
# foods.sort()  # 오름차순 정렬
# print("오름차순 정렬 : " foods)
# foods.sort(reverse=True) # 내림차순 정렬
# print("내림차순 정렬 :", foods)
# print()

# 8. 세 개의 숫자 입력받아 합과 평균 계산 후 출력

# n1 = int(input("숫자1:"))
# n2 = int(input("숫자2:"))
# n3 = int(input("숫자3:"))

# total = n1 + n2+ n3
# print(f"{n1} + {n2} +{n3} = {tltal}")
# print(f"평균:"
# print(f"
      


# 9. 문자열 입력받아 앞 3글자 + 뒤 2글자 합쳐서 출력

# name = input("문자열입력:")

# print(name[:3] + name[-2:])

# 10. 문자열 입력받아 대문자로 변환 후, 앞 5글자만 출력

# n1 = input("문자열:")

# n1 = n1.upper()
# print(n1[0:5])
# print(n1[:5])

