# 변수의 스코프

# 전역변수 - 함수 외부에 선언된 변수, 자바에서는 멤버변수처럼 함수어디서든 접근할 수 있다.
# 지역변수 - 함수 내부에 선엔된 변수, 해당 함수 내에서만 접근 가능하다,..

# -> global 키워드 사용해야 함수 내부에서 전역변수의 값을 변경할 수 있음
count = 0

def ex1():
    count =10
    print("ex1() :", count)

def ex2():
    global count #전역변수 count 사용선언
    dount += 1
    print("ex2():", count)

print("count:", count)

ex1()
print("ex1()호출후 count:",count)
