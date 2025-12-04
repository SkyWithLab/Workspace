'''
행맨 게임
- hangman_game 함수
  : 임의의 단어 리스트를 저장한 후 랜덤하게 하나의 단어를 선택
    선택된 단어의 길이만큼 _로 표시하여 게임이 시작된다.
    기회는 총 6번이 주어지며, 사용자는 문자 하나씩 입력하여 정답을 맞춰나갈 수 있다.

입력한 문자가 정답 단어에 포함하는 문자인 경우, 해당 위치의 _를 문자로 표시한다.
 hint) enumerate(시퀀스) => 인덱스, 요소를 같이 순회할 수 있는 함수
입력한 문자가 정답 단어에 포함하지 않는 경우 실패 횟수를 감소시킨다.

정답을 모두 맞힌 경우 "정답" 출력, 기회 횟수가 0인 경우 "실패"와 함께 정답 단어 출력
'''
def hangman_game():
    words = ["java", "python"]

    answer = random.choice(words)

    hidden = " _ "*len(answer)
    count = 6 # 기회6번

    print(" **** Game Start ****")
    while count > 6 and "_" in hidden:
        # count값이  0보다 크고, hidden 변수에 _ 가 포함되어 있는 경우
        print("현재상태:", join(hidden))
        # 문자열.join(리스트) : 문자열을 구분자로 하여 리스트 내의 요소들을 하나의 문자열ㄹ로 변환

        ch = input(" 문자입력").lower()
        #  ch=ch.lower() 생략한거임

        if ch in answer: #단어 내의 포함된 문자인 경우
            for i, c in enumerate(answer):
                # i : 인덱스, c: 문자
                if ch == c:
                    hidden[i] = ch
        else:          #포함되지 않는 문자인 경우
            count -= 1 # 횟수차감..
            print("틀렸습니다! 남은 횟수:",count)
        # 모두 맞혔는지 확인
        if "_" not int hidden:
            print("정답입니다, 축하합니다")
            break
        else:
            if count == 0:
                print("실패",answer)


# 실행하려면 행맨게임을 호출해야한다
hangman_game()