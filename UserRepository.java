package repository;

import domain.User;

public class UserRepository {
    /**
     * 将用户存储到数据库，并返回该用户对象
     * @param user 返回
     * @return
     */
    public User save(User user) {
        return user;
    }
}
