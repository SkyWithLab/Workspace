#  매개변수 argments : 함수로 전달되는 값을 저장하는 변수
# 1) 기본값 매개변수
#    :전달된 값이 없을 경우 기본값을 설정할 수 있음
# def hello(name="친구"):
#     print(f"{name}님, 안녕하세요!")
# hello("수정")
# hello()

# # 2) 가변인자 (*args)
# #    :개수가 정해지지 않은 값들을 전달받을 때 사용

# def print_numbers(*numbers):
#     print("전달된 숫자들...",numbers)
#     print("총합:",(numbers))

# print_numbers(1,2,3)
# print_numbers(10,50)

# (**keargs) 키워드가변인자
            # : 특정 키워드를 지정하여 값들을 전달받을 때 사용
def print_data(**data):
    # data -> dict(딕셔너리) 형태로 전달됨
    for key, value in data.items():
        print(f"{key} : {value}")

print_data(name="홍길동", age=20, hobby="드라마보기")
