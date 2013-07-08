package staff;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;


public class StaffRowMapper implements RowMapper{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Staff staff = new Staff();
		staff.setStaff_id(rs.getInt("Staff_id"));
		staff.setStaff_name(rs.getString("Staff_name"));
		staff.setStaff_email(rs.getString("Staff_email"));
		return staff;
	}
	public Staff findByStaff_id(int Staff_id){
		 
		String sql = "SELECT * FROM Vascon WHERE Staff_id = ?";
	 
		Staff staff = (staff).getJdbcTemplate().queryForObject(
				sql, new Object[] { Staff_id }, new StaffRowMapper());
	 
		return staff;

}
	}
