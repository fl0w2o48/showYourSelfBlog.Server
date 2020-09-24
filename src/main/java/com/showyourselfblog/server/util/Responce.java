package com.showyourselfblog.server.util;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description 返回数据实体
 * @program ShowYourselfBlogServer
 * @Author Peng Jiankun
 * @Date 2020-09-20 13:03
 **/

@Data
public class Responce {

    Logger log= LoggerFactory.getLogger(this.getClass());

    int code;
    String msg;
    JSONObject data;
    boolean success;

    public Responce(int ecode) {
        try{
        code=ecode;
        msg=GetMsg.GetMsgs(code);
        success=false;
        if ("ok".equals(msg)){
            success=true;
        }
        }catch (IOException e){
            log.error(e.toString());
        }
    }


}
