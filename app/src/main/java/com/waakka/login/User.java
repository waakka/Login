package com.waakka.login;

/**
 * Created by Administrator on 2018/2/7.
 */

public class User {

    private String name;
    private String pwd;

    private Inner inner;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
        inner = new Inner();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    class Inner{
        private String detail;

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "detail='" + detail + '\'' +
                    '}';
        }
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
