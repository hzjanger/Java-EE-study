package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class AnnotationUser {

    @Value("chengcheng")
    private String uname;

    public AnnotationUser() {
    }

    public AnnotationUser(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "AnnotationUser{" +
                "uname='" + uname + '\'' +
                '}';
    }
}
