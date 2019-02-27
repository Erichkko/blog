package com.zll.blog.pojo;

import java.util.Date;

public class SortInfo {
    private Long id;

    private String tb_name;

    private Long tb_number;

    private Date create_by;

    private Date modified_by;

    private Boolean is_effective;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTb_name() {
        return tb_name;
    }

    public void setTb_name(String tb_name) {
        this.tb_name = tb_name == null ? null : tb_name.trim();
    }

    public Long getTb_number() {
        return tb_number;
    }

    public void setTb_number(Long tb_number) {
        this.tb_number = tb_number;
    }

    public Date getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Date create_by) {
        this.create_by = create_by;
    }

    public Date getModified_by() {
        return modified_by;
    }

    public void setModified_by(Date modified_by) {
        this.modified_by = modified_by;
    }

    public Boolean getIs_effective() {
        return is_effective;
    }

    public void setIs_effective(Boolean is_effective) {
        this.is_effective = is_effective;
    }
}