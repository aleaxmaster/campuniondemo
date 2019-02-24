package mybatisfirst.demo.controller;

import mybatisfirst.demo.dao.UserInfoMapper;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserInfoController {
    @Resource
    UserInfoMapper userInfoMapper;

}
