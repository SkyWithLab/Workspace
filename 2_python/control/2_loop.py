# loop.py
import random
'''
반복문
        기본구조 

        for 변수명 in 반복가능한객체:       #반복 가능한 객체: 리스트, 튜플, 세트, 딕셔너리,문자열, range
        
                반복할 내용
        range(stop) : 0부터 stop -1 까지 1씩 중가하는 숫자들을 생성
        range(start stop): 
        range(start stop
        
        1-10까지 출력)
'''
# for i in range(1,11):
#     print(i, end=" ")  #end=" " 한줄로 쭉

#     # 리스트에 저장되어 있는 요소들으 출력
#     colors = ["red","orange","yellow"]
#     for c in colors:
#         print(c, end=" ")


# print()

      
    # -----------while문 사용 1-10 출력하기-------------
# n = 1

# while n <= 10:
#     print(n, end=" ")


    # while문을 사용하여 
    #     사용자 입력이 exit인 경우 종료
    #         그렇지 않으면 입력값출력

# while True:
#     data = input("단어를 입력하세요(exit을 입력할 셩우 종료): ")

#     if data.lower() == 'exit': #파이썬에서는 문자열의 값 비교 가능!
#         print("프로그램 종료")
#         break

#     print(f"입력된 값: {data}")

'''===================================================================='''

#                               *업앤다운 게임

#                    1-100 사이의 숫자로 업앤다운 맞추는 게임
    
print("=======Up & Down======")

answer = random.randint(1,100)

while True:
    # user = int(input("입력:"))
    user = input("입력 :")

    if not user.isdigit():
        print("숫자만 입력해주세요---")
        continue

    user = int(user)

    if user == answer:
        print("정답입니다!! 프로그램을 종료합니다.")
        break
    elif user > answer:
        print("Down!!!!!!!!!!!!!")
    else:
        print("Up!!!!!!!!!!!!!!!")

'''===================================================================='''