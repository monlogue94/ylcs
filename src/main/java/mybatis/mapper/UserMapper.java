package mybatis.mapper;

import mybatis.po.User;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface UserMapper {
    public User findUserById(int id) throws Exception;
   // public static List<User> all()throws Exception;

    public void deleteUser(int id) throws Exception;


}