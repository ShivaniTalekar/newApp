package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("UsersDAO")
public class UsersDAO {
	
	private NamedParameterJdbcTemplate myJdbcTemplate;
	String res="";
	public NamedParameterJdbcTemplate getMyJdbcTemplate() {
		return myJdbcTemplate;
	}
	
	@Autowired
	public void setMyJdbcTemplate(DataSource ds) {
		this.myJdbcTemplate =new NamedParameterJdbcTemplate(ds);
	}
	
	public String validateuser(final String enteredname,final String password)
	{
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("username", enteredname);
		params.addValue("password", password);
		
		
		System.out.println(enteredname+" "+password);
		 myJdbcTemplate.query("select * from users where username=:username",params,
				new RowMapper<Users>() {
			 
					public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
						if(rowNum==0)
						{
							if(rs.getString("username").equals(enteredname))
							{
								if(rs.getString("password").equals(password))
								{
									System.out.println("Welcome "+enteredname);
									res=res+"validuser";
									
								}
								else
								{
									System.out.println("Invalid password for user "+enteredname);
									res=res+"invalidpassword";
								}
							}
							else
							{
								System.out.println("User with name "+enteredname+" doesnt exist");
								res=res+"invaliduser";
							}
							
						}
						else {
							System.out.println("Invalid User");
							res=res+"invaliduser";
						}
						return null;
						
					}
				}
			);
		 System.out.println("Returning result from UsersDAO to myApp");
		return res;

		
	}

}
