package com.recordkeep.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.recordkeep.model.Record;  

public class RecordDAO {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}
	
	public List<Record> getRecords(){  
	    return template.query("select * from info",new RowMapper<Record>(){  
	        public Record mapRow(ResultSet rs, int row) throws SQLException {  
	        	Record e=new Record();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            return e;  
	        }  
	    });  
	}  
}
