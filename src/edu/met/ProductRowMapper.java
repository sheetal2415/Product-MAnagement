package edu.met;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class ProductRowMapper implements RowMapper<Product> {
@Override
public Product mapRow(ResultSet arg0, int arg1) throws SQLException {
// TODO Auto-generated method stub
Product p1=new Product();
p1.setPid(arg0.getInt(1));
p1.setPname(arg0.getString(2));
p1.setPdesc(arg0.getString(3));
p1.setPrice(arg0.getInt(4));
return p1;
}
}