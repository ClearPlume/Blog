package top.fallenangel.blog.enums;

import lombok.Getter;

@Getter
public enum EResultCode {
    SUCCESS(200, "success"),
    FAILURE(400, "failure");

    private final int code;
    private final String msg;

    EResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
