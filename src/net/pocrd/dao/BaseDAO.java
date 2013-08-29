package net.pocrd.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.pocrd.util.CommonConfig;
import net.pocrd.util.JDBCPoolConfig;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class BaseDAO {
    private static DataSource   datasource     = null;
//    static {
//        Context initCtx;
//        try {
//            initCtx = new InitialContext();
//            datasource = (DataSource)initCtx.lookup("java:comp/env/jdbc/test");
//        } catch (NamingException e) {
//            logger.error(e);
//        }
//    }
    
    static {
        PoolProperties p = new PoolProperties();
        JDBCPoolConfig config=CommonConfig.Instance.jdbcPoolConfig;
        p.setUrl(config.getJdbcUrl());
        p.setDriverClassName(config.getDriverClassName());
        p.setUsername(config.getUserName());
        p.setPassword(config.getPassword());
        p.setJmxEnabled(config.isJmxEnabled());
        p.setTestWhileIdle(config.isTestWhileIdle());
        p.setTestOnBorrow(config.isTestOnBorrow());
        p.setTestOnReturn(config.isTestOnReturn());
        p.setValidationQuery(config.getValidationQuery());
        p.setValidationInterval(config.getValidationInterval());
        p.setTimeBetweenEvictionRunsMillis(config.getTimeBetweenEvictionRunsMillis());
        p.setMinEvictableIdleTimeMillis(config.getMinEvictableIdleTimeMillis());
        p.setMaxActive(config.getMaxActive());
        p.setInitialSize(config.getInitialSize());
        p.setMaxWait(config.getMaxWait());
        p.setMinIdle(config.getMinIdle());
        p.setMaxIdle(config.getMaxIdle());
        p.setLogAbandoned(config.isLogAbandoned());
        p.setRemoveAbandoned(config.isRemoveAbandoned());
        p.setRemoveAbandonedTimeout(config.getRemoveAbandonedTimeout());
        p.setJdbcInterceptors(config.getJdbcInterceptors());
        datasource= new DataSource();
        datasource.setPoolProperties(p);
    }

    public static final Connection getConnection() throws SQLException {
        return datasource.getConnection();
    }

    public static final void closeQuietly(Connection conn, ResultSet rs, Statement st) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}