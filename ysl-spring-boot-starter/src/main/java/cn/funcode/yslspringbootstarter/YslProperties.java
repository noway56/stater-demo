package cn.funcode.yslspringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 *
 */
@ConfigurationProperties(prefix="ysl")
public class YslProperties {

    private String name;

    private String age;

    private String play;

    private String bundleName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }
}
