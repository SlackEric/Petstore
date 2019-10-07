package eric.petstore.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.apache.ibatis.annotations.Select;
import eric.petstore.model.User;

@Mapper
@Service
public interface UserMapper {
    @Select("SELECT * FROM `test`.`users` where username= #{username}")
    User getUserInfo(String username);
}
