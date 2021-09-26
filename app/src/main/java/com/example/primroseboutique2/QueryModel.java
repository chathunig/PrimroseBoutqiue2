package com.example.primroseboutique2;

public class QueryModel
{
    String prodname, sellername, querybody,purl;
    QueryModel()
    {

    }
    public QueryModel(String prodname, String sellername, String querybody, String purl) {
        this.prodname = prodname;
        this.sellername = sellername;
        this.querybody = querybody;
        this.purl = purl;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getQuerybody() {
        return querybody;
    }

    public void setQuerybody(String querybody) {
        this.querybody = querybody;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
