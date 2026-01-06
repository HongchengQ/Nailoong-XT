package com.nailong.xt.common.dao;

import com.nailong.xt.common.model.po.Tables;
import com.nailong.xt.common.model.po.User;
import com.nailong.xt.common.model.po.UserTable;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.babyfish.jimmer.sql.JSqlClient;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@Log4j2
public class UserRepository {

    private final JSqlClient sqlClient;

    UserTable userTable = Tables.USER_TABLE;

    public User queryUserById(Long id) {
        return sqlClient.createQuery(userTable)
                .where(userTable.id().eq(id))
                .select(userTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public User queryUserByOpenId(String openId) {
        return sqlClient.createQuery(userTable)
                .where(userTable.openId().eq(openId))
                .select(userTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public User queryUserByLoginToken(String token) {
        return sqlClient.createQuery(userTable)
                .where(userTable.loginToken().eq(token))
                .select(userTable)
                .execute()
                .stream()
                .findFirst()
                .orElse(null);
    }
}
