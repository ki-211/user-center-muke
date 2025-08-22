package org.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登陆请求体
 *
 * @author zkt
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 319495926576447745L;

    private String userAccount;

    private String userPassword;

}
