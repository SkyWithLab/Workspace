# 람다: 간단한 연산 기능을 한줄로 표현하는 방법
# -lambda 카워드사용
# -lambda 매개변수: 연산식
# 리스트, 튜플 등 자료 구조에서 제공되는 기능 에 활용(함수)
# 일반함수
def square(x):
    return x*x

square_lambda = lambda x: x*x

print(square(6))
print(square_lambda(6))

#  정렬 예제
numbers = [(1,5) , (2,1), (3, 3)]
sorted(numbers, key=lambda x: x[1]) #두번째 값을 기준으로 정렬
print(result)