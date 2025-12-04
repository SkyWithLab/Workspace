
name = '홍길동'
age = 20    #정수형
height = 172.5 #실수형
is_student = True   # 파이썬에서는 _(언더바)로 변수명을 지어주는편. 자바에서는 카멜케이스

print(" 변수의 타입 확인")
print(name, " : " , type(name)) # str
print(age, ":" , type(age)) # int
print(height, ":",type(height)) #float
print(is_student, ":", type(is_student)) #bool

# 팁) 여러변수를 동시에 선언하는 방법? ...
x, y, z = 10,5.5,"Hi"
print(x,y,z)
print(x, ":", type(x))
print(y, ":",type(y))
print(z,":",type(z))

# 타입 변환 ? ////자료형 다른 자료형으로 바꾸는...
# byte > short > int > long > float > double    이건 자바 ,,
#         char

# 문자열 > 정수로 변경할거임
str1 ="123"
i1 = int(str1)
print("str->i1 :", i1,type(i1)) 

# 문자열에서 실수로 바꿀거임
str2 = "3.141592"
f1 =float(str2)
print("str2->f1:", f1, type(f1)) 

# 실수에서 문자열로 또 버꿀거임.........!!!!!!!!!
str3 = str(f1)  # str3 이라는 변수에다가 str-문자열 ,, (f1)-위에3.141592 임..
print("f1->str3:",str3,type(str3))

# 정수에서 실수로 바꾼다
i2=55
f2=float(i2)
print(f2, type(f2)) #파이썬에서는 형환과정이 필요하기때문에........

#실수 -> 
f3 = 9.99
i3 = int(f3)
print(i3, type(i3)) #int로 확인됨,  소숫점 버림 처리 됨

# 문자열을 불리언으로 변경할거임
str4 = "True"
b1 = bool(str4)
print(b1, type(b1))

# 숫자를 불리언으로 0True 
i4 = 0
b2 = bool(i4)
print(b2, type(b2))

print(bool(1))#0 인 경우 False 그 외에는True로 확인된다.