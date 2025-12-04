# practice3.py

# * 다음 문제에 대하여 함수로 정의하여 풀이 *

# print_line 함수 : 구분선을 출력하는 함수
#   출력 예) ****************************** (30)

# #1 get_word_length 함수 : 문자열을 입력받아 문자열 길이 반환하는 함수

# #2 celsius_to_fahrenheit 함수 : 섭씨를 입력받아 화씨로 변환하는 함수 
#    - 실수(float) 타입으로 반환.
#    - 변환 공식 : ℉=(℃×9/5​)+32

# #3 calc_bmi 함수 : 몸무게와 키를 입력받아 BMI 지수를 계산하는 함수
#    - BMI = 몸무게(kg) / (키(m) * 키(m))

# #4 average 함수 : 전달된 값들의 평균을 계산하는 함수
#    - 전달된 값이 없을 경우 "값이 없습니다." 반환

# #5 make_password 함수 : 전달된 길이만큼 랜덤으로 비밀번호를 생성하는 함수
#    - string 모듈 활용
#      string.ascii_letters : 모든 알파벳 (대문자 + 소문자)
#      string.digits        : 0 ~ 9 숫자
#      string.punctuation   : 특수문자 (!, @, #, ...)

#----------------------------------------------
print_line()

print("#1 문자열을 입력받아 단어 수를 반환 ")
word = input("문자열 : ")
word_len = get_word_length(word)
print(f"문자열 길이 : {word_len}")

print_line()

print("#2 섭씨를 입력받아 화씨로 변환 ")
celsius = float(input("섭씨 입력 (℃): "))
fahrenheit = celsius_to_fahrenheit(celsius)
print(f"{celsius}℃ -> {fahrenheit}℉")

print_line()

print("#3 BMI 계산")
weight = float(input("몸무게 (kg): "))
height = float(input("키 (m): "))
bmi = calc_bmi(w=weight, h=height)
print(f"BMI 지수 : {bmi}")

print_line()

print("#4 평균 계산")
print(f"첫 번째 결과 : {average(10, 20, 30)}")
print(f"두 번째 결과 : {average(5, 15)}")
print(f"세 번째 결과 : {average()}")

print_line()

print("#5 새로운 비밀번호 생성")
pwd_length = int(input("생성할 비밀번호 길이 : "))
new_password = make_password(pwd_length)
print(f"생성된 비밀번호 : {new_password}")