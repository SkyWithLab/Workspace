# import
# 매개변수가 없고, 반환겂도 없는 함수 정의하기

# def f1():
#     print("나는f1함수야")
#     print("전달받는 값도 없고, 돌려줄 ㄱ값도 없으")

# f1() #함수길행하는 부분..

# 매개변수가 있고, 반환값이 없는 함수
# def f2(message):
#     print("나는 f2함수")
#     print("전달된 값을 가지고 어떠한 기능을 수행할 수 있어")
#     print(f"{message}")

# f2("전달되는 값이야")
# f2("해피해피")

# 매객변수가 없고, 반환값이 있는 함수...
# def f3():    #매개변수없음
#     print("나는f3함수")
#     print("전달받는 겂은 없고, 주기만할거야")
#     return random.randint(1, 100)

# # f3()
# result = f3()
# print("f3 함수가 전달해준 값",result)

# 매개변수, 번환값이 모두 있는 함수 작성해보기
def add(a, b):
    # 함수 첫 줄에 도움말 표시/// 주석과 비슷,, 
    '''
        도움말

        Args
            a: 첫번째 정수
            b: 두번째 정수
    '''
    print("나는 add 함수야")
    print("전달받은 두 수를 합해서 돌려줄게")
    return a + b

result2 = add(5,10)
print("add함수가 돌려준값", result2)
