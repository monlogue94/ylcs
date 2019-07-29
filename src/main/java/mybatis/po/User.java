package mybatis.po;



public class User {


    private  int id;
    private String titele;
    private  String publisher;

    private  String type;
    private String tag;
    private  String source_url;

    private  String  web_site;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitele() {
        return titele;
    }

    public void setTitele(String titele) {
        this.titele = titele;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public String getWeb_site() {
        return web_site;
    }

    public void setWeb_site(String web_site) {
        this.web_site = web_site;
    }


    @Override
    public String toString() {
        return "mybatis.po.article{" +
                "id=" + id +
                ", titele='" + titele + '\'' +
                ", publisher='" + publisher + '\'' +

                ", type='" + type + '\'' +
                ", tag='" + tag + '\'' +
                ", source_url='" + source_url + '\'' +
                ", web_site='" + web_site + '\'' +

                '}';
    }
}
