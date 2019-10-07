package eric.petstore.service;

import eric.petstore.model.User;

public interface PetstoreService {
    User getUserInfo(String username);
}
