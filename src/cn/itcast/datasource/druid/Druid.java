package cn.itcast.datasource.druid;

//import com.alibaba.druid.pool.DruidDataSourceFactory;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.util.Properties;

//public class Druid {
//    public static void main(String[] args) throws Exception {
//        //加载配置文件
//        Properties pro = new Properties();
//        InputStream inputStream = Druid.class.getClassLoader().getResourceAsStream("druid.properties");
//        pro.load(inputStream);
//        //获取连接池对象
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        //获取连接
//        Connection connection = dataSource.getConnection();
//
//
//
//    }
//}

//import cn.itcast.util.JDBCUtils;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Druid {
//    public static void main(String[] args) throws Exception {
//
//        Connection connection = null;
//        PreparedStatement pstmt = null;
//
//        try {
//            //获取连接
//            connection = JDBCUtils.getConnection();
//            //定义sql
//            String sql = "insert into account values(null, ?, ?)";
//            //获取pstmt对象
//            pstmt = connection.prepareStatement(sql);
//            ;
//            //给问号赋值
//            pstmt.setString(1,"王五");
//            pstmt.setDouble(2, Double.parseDouble("3000"));
//            //执行sql
//            int count = pstmt.executeUpdate();
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }finally {
//            //释放资源
//            JDBCUtils.close(pstmt, connection);
//        }
//
//    }
//
//}