package mybatisfirst.demo.dao;

import mybatisfirst.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    void addUserInfo(UserInfo userInfo);

}
