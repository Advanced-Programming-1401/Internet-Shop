import java.util.Date;

public class Guarantee {
    private String type;
    private Date expireDate;
    private String company;

    public Guarantee(String type, Date time, String company) {
        this.type = type;
        this.expireDate = time;
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isExpired() {
        Date now = new Date();
        return (now.compareTo(this.expireDate) > 0);
    }
}
