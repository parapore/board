package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddCommentDAO {

	// DBにid,name,commentを加えるメソッド
	public AddCommentDAO(Board bo) {

		if(bo.getName().isEmpty()) {
			bo.setName( "名無し");
		}
		if(bo.getComment().isEmpty()) {
			bo.setComment( "コメント無し");
		}


		final String jdbcId = "root";
		final String jdbcPass = "UCoRhgOiI3BO";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/board_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=JST";

		/*接続を表すConnectionオブジェクトを初期化*/
		Connection con = null;

		try {

			con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);

			System.out.println("Connected....");

			try {

				PreparedStatement ps = con.prepareStatement("INSERT INTO board (name, comment) VALUES (?, ?)");

				ps.setString(1, bo.getName());
				ps.setString(2, bo.getComment());

				// ひな形を送信
				int r = ps.executeUpdate();

				if (r != 0) {
					System.out.println(r + "件の書き込みを追加しました。");
				} else {
					System.out.println("書き込みできませんでした。");
				}

				/*Statementオブジェクトを閉じる*/
				ps.close();

				/*Connectionオブジェクトを閉じる*/
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// データベース接続の切断
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (SQLException e) {

			/*エラーメッセージ出力*/
			e.printStackTrace();
			System.out.println("Connection Failed.");

		}

	}

}