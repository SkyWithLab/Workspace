# !_condition.py

import random


# 조건문..ㅠㅠㅠㅠㅠㅠㅠㅠㅠ

#  if문 구조

        # if 조건식
            # 조건을 만족하는 경우 실행할 내용
        # elif 조건식2:
            # 조건을 만족하지 않고, 조건2를 만족하는 경우실행할내용을 작성
        # else: 
            # 모든 조건을 만족하지 않는 경우 실행할 내용작성

# 숫자를 입력받아. 짝수인지 홀수인지 판별하는 코드작성하기.

# n1 = int(input("숫자 입력"))

# if n1 % 2 == 0:
#     print(f"{n1} 은 짝수입니다.")
# else:
#     print(f"{n1} 은 홀수입니다.")

# 나이를 입력받아 성인 여부 출력(19세 이상을 성인으로 판단)

# age = int(input("나이를 입력해주세요:")) #나이를 입력받아야하니까 int로

# if age >=0:
#     if age >= 19:
#         print("성인입니다.")
#     else:
#         print("미성년자입니다")
# else:
#     print("나이는음수가 될 수 없습니다")

# *가위바위보 게임(단판ㄱ임)
# 사용자에게 가위, 바위 , 보 중에 하나를 입력받고,,,
# 컴퓨터는 랜덤하게 하나를 선택할거임
# 두개의 값을 비교하여 승패를 결정........
# 승) 가위, 컴퓨터:보 // 사용자 : 바위, 컴퓨터: 가위 
# 패) 승의 반대.....
# 비김) 같은경우,
# ===============================================
# 랜덤값ㅂ을 추출할때 : randim 모듈 사용
                    # -> 모듈: 미리 만들어져 있는 기능 (파일)
# import random 추가 해야함.............

# random.random() : 0이상 1미만의 실수값을 랜덤하게 (Math,random과 유사하다)
# random.randint(start, end): start 이상 end 미만의 정수(Random유사)
# random.choice(시퀀스): 시퀀스(리스트 문자열등)에서 임의의 요소(안에 들어있는 데이터 등등) 선택

print("-----------가위 바위 보------------")

# for i in range(1, 4)
#     print(f"round {i}")

rps =["가위", "바위", "보"]

soojeong = input("가위,바위,보 중에 하나를 입력하세요 :")

# if rps.index(soojeong) >= 0 :
#     pass

if soojeong in rps:
    pc1 = random.choice(rps)

    print(f"사용자 : {soojeong}\t 컴퓨터 :{pc1}")

    if soojeong == pc1:
        print("비겼습니다")
    elif soojeong == "가위" and pc1 == "보" or \
        soojeong == "바위" and pc1 == "가위"or\
        soojeong == "보" and pc1 == "바위":
        print("이겼습니다")
    else:
        print("졌습니다")
else:
    print("잘못 입력했습니다")




