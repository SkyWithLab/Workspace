#연산자

# 산술연산자
n1 = 15
n2 = 4

# n1 = 15; n2 = 4     -> 한줄에 변수를 여러 개 선언할 경우 세미콜론으로

print(" ===산술연산자===")
print("n1 + n2 =", n1+n2)
print("n1 - n2 =", n1-n2)
print("n1 * n2 =", n1*n2)

print("n1 / n2 =", n1/n2) # 실수 나눗셈
print("n1 // n2=", n1//n2) # 정수 나눗셈 몫
print("n1 % n2=", n1%n2) #나머지

print("n1 ** n2=", n1**n2) #제곱

print() # 줄바꿈

#  큰 수 표현 : en표현
print(5 * 10 ** 13) #5x10^13
print(5e13)

print(5e16) # 5e+16
print()
# 비교연산자 ->자바와 동일했다....................
print("비교연산자")     #대,소 비교는 왼쪽이 기준임
print("n1 == n2?", n1 == n2)#False
print("n1 != n2?", n1!= n2)#True
print("n1 < n2?", n1< n2)   #False
print("n1 > n2?", n1> n2)   #True
print("n1 <=n2?", n1<=n2)   #False
print("n1 >=n2?", n1>=n2)   #True
print()

#  논리연산자 ->and or not
x = True
y = False
print("논리 연산자 -==---===")
print("x and y ?", x and y)
print("x or y ? ",x or y)
print("not x ? ",not x)
print("not y? ", not y)