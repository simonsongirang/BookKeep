package com.recordkeep.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.recordkeep.model.Record;  
import java.sql.Date;
import java.math.BigDecimal;



public class RecordDAO {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}
	
	public List<Record> getRecords(){  
	    return template.query("select * from records",new RowMapper<Record>(){  
	        public Record mapRow(ResultSet rs, int row) throws SQLException {  
	        	Record e=new Record();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));
	            e.setCategory(rs.getString(3));
	            e.setDate(rs.getDate(4));
	            e.setDebit(rs.getBigDecimal(5));
	            e.setCredit(rs.getBigDecimal(6));
	            e.setPaymentType(rs.getString(7));
	            e.setPayee(rs.getString(8));
	            e.setPayer(rs.getString(9));
	            e.setNote(rs.getString(2));
	            return e;  
	        }  
	    });  
	}  
	
}
