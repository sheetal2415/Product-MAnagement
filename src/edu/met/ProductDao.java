package edu.met;

	import java.util.List;
	import org.springframework.jdbc.core.JdbcTemplate;
	public class ProductDao {
	JdbcTemplate jdbcT;
	public void setJdbcT(JdbcTemplate jdbcT) {
	this.jdbcT = jdbcT;
	}
	int savedProduct(Product p1)
	{
		String query="insert into product values("+p1.getPid()
		+",'"+p1.getPname()+"','"+p1.getPdesc()+"',"+p1.getPrice()+")";
		return jdbcT.update(query);
		}
	
		public int updateProduct(Product p1, String pname)
		{
		String uQuery="update product set pname=? where pid=?";
		return jdbcT.update(uQuery,pname,p1.getPid());
		}
		
		public List<Product> getProduct() {
	        String sqlQuery = "SELECT * FROM product";
	        return jdbcT.query(sqlQuery, new ProductRowMapper());
	    }

	    public int deleteProduct(int pid) {
	        String deleteQuery = "DELETE FROM product WHERE pid = ?";
	        return jdbcT.update(deleteQuery, pid);
	    }
	}

