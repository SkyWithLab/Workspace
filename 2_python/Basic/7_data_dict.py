#딕셔너리-> Map과 유사
# 특징 -> 키,벨류 한 쌍으로 데이터가 관리됨 키값은 중복을 허용하지 않는다.

user = {"name": "홍길동","age":"20","phone":"010-0000-0000" }
print(user)

print("사용자 이름: ",user["name"])
print("나이: ", user.get("age")) # get 이라는 메소드 사용해서 출력
print("폰번호:", user["phone"])

# 데이터 추가
user["hobby"] = "야구보기"
print(user)

print("키값들만 조회 : ", user.keys())
print("벨류값만 조회 : ", user.values())

# 데이터 삭제하기
user.pop("phone")
print(user)
