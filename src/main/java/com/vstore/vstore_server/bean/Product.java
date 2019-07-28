package com.vstore.vstore_server.bean;

/**
 * @author LinYin
 * @date 2019-07-28 14:51
 * 逆向工程自动生成的domain
 */
public class Product {
    private String id;

    private String name;

    private String desp;

    private String price;

    private String detail;

    private String imgs;

    private Integer status;

    private String categoryid;

    private String pcategoryid;

    public Product() {
    }

    public Product(String id, String name, String desp, String price, String detail, String imgs, Integer status, String categoryid, String pcategoryid) {
        this.id = id;
        this.name = name;
        this.desp = desp;
        this.price = price;
        this.detail = detail;
        this.imgs = imgs;
        this.status = status;
        this.categoryid = categoryid;
        this.pcategoryid = pcategoryid;
    }

    public Product(Product1 product1){
        this.id = product1.getId();
        this.name = product1.getName();
        this.desp = product1.getDesp();
        this.price = product1.getPrice();
        this.detail = product1.getDetail();
        this.imgs = product1.getImgs().toString();
        this.status = product1.getStatus();
        this.categoryid = product1.getCategoryid();
        this.pcategoryid = product1.getPcategoryid();
    }
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

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
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

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desp='" + desp + '\'' +
                ", price='" + price + '\'' +
                ", detail='" + detail + '\'' +
                ", imgs='" + imgs + '\'' +
                ", status=" + status +
                ", categoryid='" + categoryid + '\'' +
                ", pcategoryid='" + pcategoryid + '\'' +
                '}';
    }
}