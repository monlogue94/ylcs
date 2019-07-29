import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import mybatis.mapper.UserMapper;
import mybatis.mapper.UserMapperImpl;
import mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestC {

    private SqlSessionFactory sqlSessionFactory;
    private InputStream resourceAsStream;

    @Before
    public void beforeTest() throws IOException {
        String resourceFile = "SqlMapConfig.xml";
        resourceAsStream = Resources.getResourceAsStream(resourceFile);
        sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(resourceAsStream);
    }

    @Test
    public void findByIDTest() throws Exception {
        SqlSession openSession = sqlSessionFactory.openSession();
        UserMapper userDaoMapper = openSession.getMapper(UserMapper.class);
       User user = userDaoMapper.findUserById(3);
        System.out.println(user);

    }
    @Test
    public void testDeleteUserById() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行删除
        sqlSession.delete("deleteUserById", 48);

        // 需要进行事务提交
        sqlSession.commit();

        // 7. 释放资源
        sqlSession.close();
    }



}