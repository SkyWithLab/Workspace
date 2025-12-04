import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main_test {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("The end");

        updateTest();  // 메서드 호출
    }

    public static void updateTest() {
        Connection conn = null;
        Statement stmt = null;
        int count = 0;  // 실행된 행 수 저장

        try {
            // 1. 드라이버 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("<< 오라클 드라이버 등록 완료 >>");

            // 2. 연결
            String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
            String user = "c##KH";
            String password = "KH";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("<< 오라클 데이터베이스 연결 성공 >>");

            // 3. 자동 커밋 해제 (명시적 트랜잭션 사용)
            conn.setAutoCommit(false);

            // 4. Statement 생성
            stmt = conn.createStatement();

            // 5. SQL 문 작성 (세미콜론 제거!)
            String sql = "UPDATE test SET Tname = '홍길동' WHERE Tno = 1";

            // 6. SQL 실행
            count = stmt.executeUpdate(sql);

            // 7. 실행 결과에 따른 처리
            if (count > 0) {
                conn.commit();  // 성공 시 커밋
                System.out.println("업데이트 성공: " + count + "행 변경");
            } else {
                conn.rollback();  // 실패 시 롤백
                System.out.println("업데이트 실패");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 연결 또는 SQL 실행 실패");
            e.printStackTrace();
        } finally {
            // 8. 자원 정리
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("<< 연결 종료 >>");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



