package cn.funcode.bundle1;

import cn.funcode.yslspringbootstarter.YslProperties;
import cn.funcode.yslspringbootstarter.YslService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YslServiceImpl implements YslService {

    @Autowired
    YslProperties properties;


    @Override
    public String yslSay(){
        return properties.getName() + "说" + properties.getAge() + "岁，他喜欢玩" + properties.getPlay();
    }
}
