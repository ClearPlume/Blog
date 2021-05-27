package top.fallenangel.blog.vo;

import lombok.Data;
import top.fallenangel.blog.enums.EResultCode;

@Data
public class ResultVO {
    private int code;
    private String msg;
    private Object data;

    private ResultVO(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVO success(Object data) {
        EResultCode success = EResultCode.SUCCESS;
        return new ResultVO(success.getCode(), success.getMsg(), data);
    }

    public static ResultVO success(Object data, EResultCode code) {
        return new ResultVO(code.getCode(), code.getMsg(), data);
    }
}
