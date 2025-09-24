package org.echomelody.pkm.entity;

import java.time.LocalDateTime;

//表示一个笔记的实体类

//该类封装了笔记的基本属性，包括ID、标题、内容、创建时间和最后更新时间。
// 创建时间在对象实例化时自动设置，修改标题或内容时会自动更新最后修改时间。

public class Note {
    private Long id;
    private String title;
    private String content;
    private final LocalDateTime createTime;
    private LocalDateTime updateTime;
    //无参构造方法
    public Note() {
        this.createTime = LocalDateTime.now();
        this.updateTime = this.createTime; // 初始时创建时间和更新时间相同
    }
    //带参数的构造方法
    public Note(String title, String content) {
        this(); // 调用无参构造方法初始化时间
        this.title = title;
        this.content = content;
    }
    // Getter方法
    //获取笔记ID
    public Long getId() {
        return id;
    }
    //获取笔记标题
    public String getTitle() {
        return title;
    }
    //获取笔记内容
    public String getContent() {
        return content;
    }
    //获取创建时间
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    //获取最后更新时间
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
    // Setter方法
    //设置笔记ID
    public void setId(Long id) {
        this.id = id;
    }
    //设置笔记标题，同时更新最后修改时间
    public void setTitle(String title) {
        this.title = title;
        this.updateTime = LocalDateTime.now(); // 更新修改时间
    }
    //设置笔记内容
    public void setContent(String content) {
        this.content = content;
        this.updateTime = LocalDateTime.now(); // 更新修改时间
    }
    //返回对象的字符串表示形式
    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}