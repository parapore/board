package otameshi;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Calendar;

public class Datetimetest {

	public static void main(String[] args) {
		final String jdbcId = "root";
		final String jdbcPass = "UCoRhgOiI3BO";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/board_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		// TODO 自動生成されたメソッド・スタブ
		 try {
		      Date sqlDate = new Date(Calendar.getInstance().getTimeInMillis());
		      Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis() - 1000*60*60*24);

		      //Class.forName("com.mysql.jdbc.Driver");
		      Connection connection = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);

		      PreparedStatement statement = connection.prepareStatement("insert into sample values ( ? );");
		      // java.sql.Date を使った場合
		      statement.setDate( 1, sqlDate );
		      statement.execute();

		      // java.sql.Timestamp を使った場合
		      statement.setTimestamp( 1, timestamp);
		      statement.execute();

		      statement.close();
		      connection.close();

		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		  }
		}