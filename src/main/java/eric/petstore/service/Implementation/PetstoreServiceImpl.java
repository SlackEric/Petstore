package eric.petstore.service.Implementation;

import eric.petstore.dao.UserMapper;
import eric.petstore.model.User;
import eric.petstore.service.PetstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetstoreServiceImpl implements PetstoreService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(String username) {
        User userInfo = userMapper.getUserInfo(username);
        return userInfo;
    }
}
