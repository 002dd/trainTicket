package jmu.edu.cn.domain;

/**
 * Created by Administrator on 2016/3/20.
 */
public enum RoleEnum {
    ROLE_ADMIN("����Ա"), ROLE_USER("��ͨ�û�");
    private String descripbe;
    private RoleEnum(String descripbe) {
        this.descripbe = descripbe;
    }

    public String getDescripbe() {
        return descripbe;
    }

    public void setDescripbe(String descripbe) {
        this.descripbe = descripbe;
    }
}
