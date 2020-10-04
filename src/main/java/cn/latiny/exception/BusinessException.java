package cn.latiny.exception;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 14:39
 * @since 1.0.0
 **/
public class BusinessException extends RuntimeException implements ErrorCode {
    private static final long serialVersionUID = 5832776712981427556L;
    private int code;
    private String message;

    public BusinessException() {
    }

    public BusinessException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getMessage());
    }

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
