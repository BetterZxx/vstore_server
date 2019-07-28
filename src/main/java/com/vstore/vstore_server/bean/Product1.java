package com.vstore.vstore_server.bean;

/**
 * @author LinYin
 * @date 2019-07-28 14:51
 * 逆向工程自动生成的domain
 */
public class Product1 {
    private String id;

    private String name;

    private String desp;

    private String price;

    private String detail;

    private String[] imgs;

    private Integer status;

    private String categoryid;

    private String pcategoryid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp == null ? null : desp.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }

    public String getPcategoryid() {
        return pcategoryid;
    }

    public void setPcategoryid(String pcategoryid) {
        this.pcategoryid = pcategoryid == null ? null : pcategoryid.trim();
    }
}