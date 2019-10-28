package com.how2java.exception;


import com.how2java.constantenum.ErrorCode;

/**
 * Description: 登录异常类
 *
 * @author gan.jin@ucarinc.com
 * @version 1.0
 * @Date 2019/10/28 10:21
 */
public class LoginException  extends RuntimeException{

        private int code;

        public LoginException(String message, ErrorCode errorCode) {//构造器的第二个参数是上面创建的那个枚举，之后把枚举里面定义的code给了这个code
            super(message);
            this.code = errorCode.getCode();
        }

        public int getCode() {
            return code;
        }

        @Override
        public String getMessage() {
            return super.getMessage();
        }
    }
