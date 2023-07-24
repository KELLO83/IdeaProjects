package Prototype_Pattern;

public class CookieMachine {
    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) cookie.clone(); // 복제된 객체를 반환합니다
    }
}
